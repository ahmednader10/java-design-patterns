package validator;

import java.util.function.Predicate;
import java.util.function.Supplier;

public interface Validator {

    default Validator thenValidate(Predicate<Person> predicate, String errorMessage) {
        return p -> {

            try {
                on(p).validate();
                if (predicate.test(p))
                    return () -> p;
                else
                {
                    ValidationException validationException = new ValidationException(errorMessage);
                    validationException.addSuppressed(new IllegalArgumentException(errorMessage));
                    return () -> { throw validationException; };
                }
            }
            catch (ValidationException e) {
                if (predicate.test(p))
                    return () -> {throw e;};
                else {
                    e.addSuppressed(new IllegalArgumentException(errorMessage));
                    return () -> {throw e;};
                }
            }
        };
    }

    static Validator validate(Predicate<Person> predicate, String errorMessage) {
        return p -> {
            if (predicate.test(p))
                return () -> p;
            else {
                ValidationException validationException = new ValidationException(errorMessage);
                validationException.addSuppressed(new IllegalArgumentException(errorMessage));
                return () -> { throw validationException; };
            }
        };
    }

    ValidatorSupplier on(Person person);

    interface ValidatorSupplier extends Supplier<Person> {
        default Person validate() {
            return get();
        }
    }

    class ValidationException extends RuntimeException{

        public ValidationException(String error) {
            super(error);
        }

    }

}


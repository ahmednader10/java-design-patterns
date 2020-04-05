package validator;

public class Main {

    public static void main(String[]args) {
        Person a = new Person("a", 1);
        Person b = new Person(null, 1);
        Person c = new Person("c", -1);
        Person d = new Person("d", 1_100);
        Person e = new Person(null, 1_100);

        a = Validator.validate(p -> p.getName() != null, "the name shouldn't be null")
                .on(a)
                .validate();
        System.out.println("a: "+a);

//        b = Validator.validate(p -> p.getName() != null, "the name shouldn't be null")
//                .thenValidate(p -> p.getAge() > 0, "age should be greater than 0")
//                .on(b)
//                .validate();

        e = Validator.validate(p -> p.getName() != null, "the name shouldn't be null")
                .thenValidate(p -> p.getAge() > 0, "age should be greater than 0")
                .thenValidate(p -> p.getAge() < 120, "age should be less than 120")
                .on(e)
                .validate();

    }
}

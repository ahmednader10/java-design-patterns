package factory;

import java.util.function.Supplier;

public interface Factory<T> extends Supplier<T> {

    default T newInstance() {

        return get();
    }

    static <T> Factory<T> createFactory(Supplier<T> supplier) {
        T singleton = supplier.get();
        return () -> singleton;
    }
}

package registry;

import factory.Factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Registry {

    Factory<Rectangle> buildRectangle(String shape) {
        return null;
    }

    public static Registry createRegistry(Consumer<Builder<Rectangle>> consumer) {
        Map<String, Factory<Rectangle>> map = new HashMap<>();
        Builder<Rectangle> builder = ((label, factory) -> map.put(label, factory));

        consumer.accept(builder);
        return null;
    }

}

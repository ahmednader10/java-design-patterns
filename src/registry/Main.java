package registry;

import java.util.function.Consumer;

public class Main {
    public static void main(String[]args) {
        Consumer<Builder<Rectangle>> consumer =
                builder -> builder.register("rectangle", Rectangle::new);

        Registry.createRegistry(consumer);
    }
}

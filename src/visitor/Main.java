package visitor;

import java.util.function.Consumer;

public class Main {

    public static void main(String[]args) {

        Car car = new Car();
        Engine engine = new Engine();
        Body body = new Body();

        Consumer<VisitorBuilder<String>> consumer =
                Visitor.<Car, String>forType(Car.class).execute((Car c) -> "Visiting car: "+c)
                .forType(Engine.class).execute((Engine e) -> "Visiting engine: "+e);

        Visitor<String> visitor = Visitor.of(consumer);

        String visitedCar = visitor.visit(car);

        System.out.println("Car: "+ visitedCar);

        String visitedEngine = visitor.visit(engine);

        System.out.println("engine: "+ visitedEngine);
//        visitor.visit(body);
    }
}

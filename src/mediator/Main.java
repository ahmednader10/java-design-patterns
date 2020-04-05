package mediator;

public class Main {
    public static void main(String[]args) {
        Mediator mediator = new Mediator();

        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        Command turnOnAllLightsCommand = new AllLightsCommand(mediator);
        turnOnAllLightsCommand.execute();

    }
}


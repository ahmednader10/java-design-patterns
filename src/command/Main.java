package command;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[]args) {
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        Switch s = new Switch();

        Command onCommand = new OnCommand(bedroomLight);

        s.storeAndExecute(onCommand);

        Command toggleCommand = new ToggleCommand(bedroomLight);

        s.storeAndExecute(toggleCommand);

        List<Light> lights = new ArrayList<>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);

        Command allLightsCommand = new AllLightsCommand(lights);

        s.storeAndExecute(allLightsCommand);
    }
}

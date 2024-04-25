package pluralsight.command;

import pluralsight.command.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        Switch lightSwitch = new Switch();

        // If one room light it turned on, then we call AllLights Off, it causes weird pluralsight.state
        Command onCommand = new ToggleCommand(bedroomLight);

        lightSwitch.storeAndExecute(onCommand);
//        lightSwitch.storeAndExecute(onCommand);
//        lightSwitch.storeAndExecute(onCommand);
//        lightSwitch.storeAndExecute(onCommand);

        List<Light> lights = new ArrayList<>();
        lights.add(kitchenLight);
        lights.add(bedroomLight);

        Command allLightsCommand = new AllLightsCommand(lights);

        lightSwitch.storeAndExecute(allLightsCommand);
    }
}

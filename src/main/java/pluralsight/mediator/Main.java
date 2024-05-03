package pluralsight.mediator;

import pluralsight.mediator.domain.command.Command;
import pluralsight.mediator.domain.Light;
import pluralsight.mediator.domain.command.TurnOffAllLightsCommand;
import pluralsight.mediator.domain.command.TurnOnAllLightsCommand;

public class Main {
    public static void main(String[] args) {

        Mediator mediator = new Mediator();

        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");

        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);

        turnOnAllLightsCommand.execute();

        Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);

        turnOffAllLightsCommand.execute();
    }
}

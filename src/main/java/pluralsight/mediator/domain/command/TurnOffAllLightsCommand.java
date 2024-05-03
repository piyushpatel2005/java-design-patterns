package pluralsight.mediator.domain.command;

import pluralsight.mediator.Mediator;
import pluralsight.mediator.domain.command.Command;

// concrete pluralsight.command
public class TurnOffAllLightsCommand implements Command {
    private Mediator med;

    public TurnOffAllLightsCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOffAllLights();
    }
}

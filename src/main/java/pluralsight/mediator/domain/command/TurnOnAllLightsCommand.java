package pluralsight.mediator.domain.command;

import pluralsight.mediator.Mediator;
import pluralsight.mediator.domain.command.Command;

public class TurnOnAllLightsCommand implements Command {
    private Mediator med;

    public TurnOnAllLightsCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOnAllLights();
    }
}

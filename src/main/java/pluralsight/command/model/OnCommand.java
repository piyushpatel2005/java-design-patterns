package pluralsight.command.model;

import pluralsight.command.model.Command;
import pluralsight.command.model.Light;

// ConcreteCommand
public class OnCommand implements Command {

    private Light light;

    public OnCommand (Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}

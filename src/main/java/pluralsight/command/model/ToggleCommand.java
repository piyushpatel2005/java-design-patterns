package pluralsight.command.model;

import pluralsight.command.model.Command;
import pluralsight.command.model.Light;

public class ToggleCommand implements Command {
    private Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.toggle();
    }
}

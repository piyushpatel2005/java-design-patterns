package pluralsight.command.model;

import pluralsight.command.model.Command;
import pluralsight.command.model.Light;

import java.util.List;

public class AllLightsCommand implements Command {

    private List<Light> lights;

    public AllLightsCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        for (Light light: lights) {
            // turn off only if it is on
            if (light.isOn()) {
                light.toggle();
            }
        }
    }
}

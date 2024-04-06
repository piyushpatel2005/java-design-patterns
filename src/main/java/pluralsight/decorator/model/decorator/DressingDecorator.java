package pluralsight.decorator.model.decorator;

import pluralsight.decorator.model.Sandwich;
import pluralsight.decorator.model.decorator.SandwichDecorator;

public class DressingDecorator extends SandwichDecorator {

    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addDressing();
    }

    private String addDressing() {
        return " + mustard";
    }
}

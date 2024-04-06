package pluralsight.decorator.model.decorator;

import pluralsight.decorator.model.Sandwich;
import pluralsight.decorator.model.decorator.SandwichDecorator;

public class MeatDecorator extends SandwichDecorator {

    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addMeat();
    }

    private String addMeat() {
        return " + turkey";
    }
}

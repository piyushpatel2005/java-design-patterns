package pluralsight.decorator.model.decorator;


import pluralsight.decorator.model.Sandwich;

// Decorators should be treated as objects
// Here it implements Sandwich interface
public abstract class SandwichDecorator implements Sandwich {

    protected Sandwich customSandwich;

    // custom sandwich can be a sandwich or another pluralsight.decorator
    public SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }

    public String make() {
        return customSandwich.make();
    }
}

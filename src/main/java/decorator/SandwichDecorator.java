package decorator;


// Decorators should be treated as objects
// Here it implements Sandwich interface
public abstract class SandwichDecorator implements Sandwich {

    protected Sandwich customSandwich;

    // custom sandwich can be a sandwich or another decorator
    public SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }

    public String make() {
        return customSandwich.make();
    }
}

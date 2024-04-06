package pluralsight.decorator.model;

import pluralsight.decorator.model.Sandwich;

public class SimpleSandwich implements Sandwich {

    @Override
    public String make() {
        return "Simple Sandwich";
    }
}

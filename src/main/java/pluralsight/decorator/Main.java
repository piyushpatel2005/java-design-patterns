package pluralsight.decorator;

import pluralsight.decorator.model.Sandwich;
import pluralsight.decorator.model.SimpleSandwich;
import pluralsight.decorator.model.decorator.DressingDecorator;
import pluralsight.decorator.model.decorator.MeatDecorator;

public class Main {

    public static void main(String[] args) {

        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        System.out.println(sandwich.make());
    }
}

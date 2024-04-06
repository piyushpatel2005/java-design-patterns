package com.github.piyushpatel2005.decorator.sandwich.decorator;

import com.github.piyushpatel2005.decorator.sandwich.domain.Sandwich;

public class ExtraCheeseDecorator extends SandwichDecorator {
    public ExtraCheeseDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String getExtraItem() {
        return ", Double Cheese ";
    }

    @Override
    public double getExtraItemPrice() {
        return 1.0d;
    }
}

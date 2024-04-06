package com.github.piyushpatel2005.decorator.sandwich.decorator;

import com.github.piyushpatel2005.decorator.sandwich.domain.Sandwich;

public class MeatDecorator extends SandwichDecorator {
    public MeatDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String getExtraItem() {
        return ", Meat ";
    }

    @Override
    public double getExtraItemPrice() {
        return 1.99;
    }
}

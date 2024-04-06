package com.github.piyushpatel2005.decorator.sandwich.decorator;

import com.github.piyushpatel2005.decorator.sandwich.domain.Sandwich;

public abstract class SandwichDecorator implements Sandwich {
    private Sandwich sandwich;

    public SandwichDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription() + " with " + getExtraItem();
    }

    @Override
    public double getPrice() {
        return sandwich.getPrice() + getExtraItemPrice();
    }

    public abstract String getExtraItem();
    public abstract double getExtraItemPrice();
}

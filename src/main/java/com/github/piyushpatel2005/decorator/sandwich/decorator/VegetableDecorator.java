package com.github.piyushpatel2005.decorator.sandwich.decorator;

import com.github.piyushpatel2005.decorator.sandwich.domain.Sandwich;

public class VegetableDecorator extends SandwichDecorator {
    private final String vegetableName;
    private final double price;

    public VegetableDecorator(Sandwich sandwich, String vegetableName, double price) {
        super(sandwich);
        this.vegetableName = vegetableName;
        this.price = price;
    }

    public String getVegetableName() {
        return vegetableName;
    }

    public double getVegetablePrice() {
        return price;
    }

    @Override
    public String getExtraItem() {
        return ", " + getVegetableName();
    }

    @Override
    public double getExtraItemPrice() {
        return getVegetablePrice();
    }
}

package com.github.piyushpatel2005.decorator.sandwich.domain;

public class SimpleCheeseSandwich implements Sandwich {
    @Override
    public String getDescription() {
        return "Simple Sandwich";
    }

    @Override
    public double getPrice() {
        return 2.49;
    }
}

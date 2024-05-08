package com.github.piyushpatel2005.strategy.discounts;

public class PercentageDiscountStrategy implements DiscountStrategy {
    private final double discountPercentage;

    public PercentageDiscountStrategy(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getDiscount(double price) {
        return price * discountPercentage / 100;
    }
}

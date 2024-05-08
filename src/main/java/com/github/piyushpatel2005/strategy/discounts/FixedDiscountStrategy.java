package com.github.piyushpatel2005.strategy.discounts;

public class FixedDiscountStrategy implements DiscountStrategy {
    private final double discountAmount;

    public FixedDiscountStrategy(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public double getDiscount(double price) {
        if (price < discountAmount) {
            return price;
        } else {
            return discountAmount;
        }
    }
}

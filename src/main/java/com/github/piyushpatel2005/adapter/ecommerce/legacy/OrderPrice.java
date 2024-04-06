package com.github.piyushpatel2005.adapter.ecommerce.legacy;

public class OrderPrice {
    private double priceInDollars;

    public OrderPrice(double amount) {
        this.priceInDollars = amount;
    }

    public double getPriceInDollars() {
        return priceInDollars;
    }
}

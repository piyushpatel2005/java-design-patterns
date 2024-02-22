package com.github.piyushpatel2005.abstractfactory.furniture.model;

public abstract class Furniture {
    protected String make;

    protected double price;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

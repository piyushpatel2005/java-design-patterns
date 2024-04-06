package com.github.piyushpatel2005.prototype.ecommerce.model;

import com.github.piyushpatel2005.prototype.ecommerce.model.Product;

public class TV extends Product {
    private String size;

    public TV(String name, String description, double price, String size) {
        super(name, description, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String toString() {
        return super.toString() + " with " + this.getSize() + " screen";
    }
}

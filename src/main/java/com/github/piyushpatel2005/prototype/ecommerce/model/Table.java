package com.github.piyushpatel2005.prototype.ecommerce.model;

import com.github.piyushpatel2005.prototype.ecommerce.model.Product;

public class Table extends Product {
    private String material;

    public Table(String name, String description, double price, String material) {
        super(name, description, price);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String toString() {
        return super.toString() + " made of " + this.getMaterial();
    }
}

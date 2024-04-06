package com.github.piyushpatel2005.flyweight.shopping.domain;

import com.github.piyushpatel2005.flyweight.shopping.service.ProductFactory;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> items;
    ProductFactory productFactory = new ProductFactory();

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public double calculateTotal() {
        return items.stream()
                .mapToDouble(item -> item.getProduct().getPrice() * item.getQuantity())
                .sum();
    }

    public void addItem(String title, String author, double price, int quantity) {
        Product product = productFactory.getProduct(title, author, price);
        items.add(new CartItem(product, quantity));
    }

    public List<CartItem> getItems() {
        return items;
    }
}

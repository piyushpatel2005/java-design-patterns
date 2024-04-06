package com.github.piyushpatel2005.flyweight.shopping;

import com.github.piyushpatel2005.flyweight.shopping.domain.Book;
import com.github.piyushpatel2005.flyweight.shopping.domain.ShoppingCart;

public class ClientMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Lord of the Rings", "J.R.R. Tolkien", 49.99, 1);
        cart.addItem("Design Patterns", "Erich Gamma", 54.99, 2);
        cart.addItem("Design Patterns", "Erich Gamma", 54.99, 2);
        cart.addItem("Clean Code", "Robert C. Martin", 43.99, 3);
        cart.addItem("Clean Code", "Robert C. Martin", 43.99, 3);
        cart.addItem("Effective Java", "Joshua Bloch", 47.99, 4);
        cart.addItem("Effective Java", "Joshua Bloch", 47.99, 4);
        cart.addItem("Effective Java", "Joshua Bloch", 47.99, 4);

        System.out.println("Total: " + cart.calculateTotal());
        System.out.println("Number of instances: " + Book.getCount());
        System.out.println("Number of items in the cart: " + cart.getItems().size());
        System.out.println("Number of products in the factory: " + cart.getItems().stream()
                .map(item -> item.getQuantity())
                .reduce(0, Integer::sum));
    }
}

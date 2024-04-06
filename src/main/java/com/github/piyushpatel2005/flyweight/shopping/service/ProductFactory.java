package com.github.piyushpatel2005.flyweight.shopping.service;

import com.github.piyushpatel2005.flyweight.shopping.domain.Book;
import com.github.piyushpatel2005.flyweight.shopping.domain.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {
    private Map<String, Product> products;

    public ProductFactory() {
        products = new HashMap<>();
    }

    public Product createProduct(String name, String author, double price) {
        return products.computeIfAbsent(name, k -> new Book(k, author, price));
    }

    public int getProductsSize() {
        return products.size();
    }

    public Product getProduct(String name, String author, double price) {
        Product product = products.get(name);
        if (product == null) {
            product = createProduct(name, author, price);
            products.put(name, product);
        }
        return product;
    }
}

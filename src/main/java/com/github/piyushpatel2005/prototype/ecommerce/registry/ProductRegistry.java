package com.github.piyushpatel2005.prototype.ecommerce.registry;

import com.github.piyushpatel2005.prototype.ecommerce.model.*;

import java.util.HashMap;
import java.util.Map;

public class ProductRegistry {
    private Map<String, Product> products = new HashMap<>();

    public ProductRegistry() {
        initialize();
    }

    private void initialize() {
        Book book = new Book("Harry Potter", "A fantasy book on adventures of Harry Potter", 20.0, 203, "J.K. Rowling");
        TV tv = new TV("Samsung V100", "A smart TV from Samsung", 200.0, "50 inch");
        Table table = new Table("Foldable 16\" table", "A table with wooden brown structure with fine finish", 199.99, "Wooden");
        products.put("Book", book);
        products.put("TV", tv);
        products.put("Table", table);
    }

    public Product cloneProduct(String productName) {
        Product product = null;
        try {
            product = products.get(productName).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}

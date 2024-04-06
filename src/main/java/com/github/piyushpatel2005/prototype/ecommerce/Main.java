package com.github.piyushpatel2005.prototype.ecommerce;

import com.github.piyushpatel2005.prototype.ecommerce.model.*;
import com.github.piyushpatel2005.prototype.ecommerce.registry.ProductRegistry;

public class Main {
    public static void main(String[] args) {
        ProductRegistry registry = new ProductRegistry();
        TV tv = (TV) registry.cloneProduct("TV");
        tv.setSize("55 inches");
        System.out.println(tv);

        Book book = (Book) registry.cloneProduct("Book");
        book.setNumberOfPages(335);
        System.out.println(book);

        Table table = (Table) registry.cloneProduct("Table");
        table.setMaterial("Plastic");
        System.out.println(table);
    }
}

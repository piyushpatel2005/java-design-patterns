package com.github.piyushpatel2005.flyweight.shopping.domain;

public class Book implements Product {
    private static int count = 0;
    private final String title;
    private final String author;
    private final double price;

    public Book(String name, String author, double price) {
        this.title = name;
        this.author = author;
        this.price = price;
        count++;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public static int getCount() {
        return count;
    }
}

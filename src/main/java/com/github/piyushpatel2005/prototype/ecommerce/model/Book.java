package com.github.piyushpatel2005.prototype.ecommerce.model;

public class Book extends Product {
    private int numberOfPages;
    private String author;

    public Book(String name, String description, double price, int numberOfPages, String author) {
        super(name, description, price);
        this.numberOfPages = numberOfPages;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String toString() {
        return super.toString() + " by " + this.getAuthor() + " with " + this.getNumberOfPages() + " pages";
    }
}

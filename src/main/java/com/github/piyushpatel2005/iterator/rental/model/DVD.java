package com.github.piyushpatel2005.iterator.rental.model;

public class DVD {
    private String title;
    private String category;
    private boolean available;

    public DVD(String title, String category) {
        this.title = title;
        this.category = category;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", available=" + available +
                '}';
    }
}

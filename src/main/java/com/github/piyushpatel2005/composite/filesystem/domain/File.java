package com.github.piyushpatel2005.composite.filesystem.domain;

public class File implements FileSystemComponent {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void listItems() {
        System.out.println(" File " + getName() + " with size " + getSize() + " bytes");
    }

    @Override
    public int getSize() {
        return size;
    }
}

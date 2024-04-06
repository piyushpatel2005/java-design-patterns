package com.github.piyushpatel2005.composite.filesystem.domain;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children;

    public Directory(String name, List<FileSystemComponent> children) {
        this.name = name;
        this.children = children;
    }

    public Directory(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    public void addComponent(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void listItems() {
        System.out.println("Directory " + getName());
        for (FileSystemComponent child : children) {
            child.listItems();
        }
    }

    @Override
    public int getSize() {
        return children.stream()
                .mapToInt(FileSystemComponent::getSize)
                .sum();
    }
}

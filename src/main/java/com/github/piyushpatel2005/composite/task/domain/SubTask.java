package com.github.piyushpatel2005.composite.task.domain;

public class SubTask implements TaskItem {
    private String name;
    private boolean completed;

    public SubTask(String name) {
        this.name = name;
        this.completed = false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isCompleted() {
        return completed;
    }

    @Override
    public void complete() {
        completed = true;
    }

    public void listItems() {
        System.out.println("SubTask: " + getName() + " is " + (isCompleted() ? "completed" : "not completed"));
    }
}

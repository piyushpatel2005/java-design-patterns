package com.github.piyushpatel2005.composite.task.domain;

public interface TaskItem {
    public String getName();
    public boolean isCompleted();
    public void complete();
    public void listItems();
}

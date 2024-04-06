package com.github.piyushpatel2005.composite.task.domain;

import java.util.ArrayList;
import java.util.List;

public class Task implements TaskItem {
    private String name;
    private List<SubTask> tasks;

    public Task(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    public void addSubTask(SubTask task) {
        tasks.add(task);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isCompleted() {
        return tasks.stream()
                .allMatch(SubTask::isCompleted);
    }

    @Override
    public void complete() {
        tasks.forEach(SubTask::complete);
    }

    public void listItems() {
        System.out.println("Task: " + getName());
        System.out.println("----------------------------------");
        for (SubTask task : tasks) {
            task.listItems();
        }
    }
}

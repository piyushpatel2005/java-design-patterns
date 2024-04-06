package com.github.piyushpatel2005.composite.task;

import com.github.piyushpatel2005.composite.task.domain.SubTask;
import com.github.piyushpatel2005.composite.task.domain.Task;

public class Main {
    public static void main(String[] args) {
        Task task = new Task("Learn Java Programming language");
        task.addSubTask(new SubTask("Read Tutorials"));
        task.addSubTask(new SubTask("Type the code examples"));
        task.addSubTask(new SubTask("Build projects"));

        task.listItems();


        System.out.println("==================================");
        System.out.println("Completing the task");
        task.complete();

        System.out.println("==================================");
        task.listItems();
    }
}

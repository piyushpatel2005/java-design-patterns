package com.github.piyushpatel2005.memento.payroll.model;

import java.util.Stack;

public class EmployeeCaretaker {
    private Stack<EmployeeMemento> history = new Stack<>();

    public void save(Employee employee) {
        history.push(employee.save());
    }

    public void revert(Employee employee) {
        employee.revert(history.pop());
    }
}

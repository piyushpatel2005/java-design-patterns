package com.github.piyushpatel2005.memento.payroll;


import com.github.piyushpatel2005.memento.payroll.model.Employee;
import com.github.piyushpatel2005.memento.payroll.model.EmployeeCaretaker;

public class ClientMain {
    public static void main(String[] args) {

        EmployeeCaretaker caretaker = new EmployeeCaretaker();

        Employee john = new Employee();

        john.setEmployeeId("123");
        john.setName("John Doe");
        john.setAddress("101 King Street");
        john.setPhone("999-555-6666");

        System.out.println("Saving Employee: " + john);
        caretaker.save(john);

        john.setPhone("444-555-6666");
        caretaker.save(john);

        System.out.println("Employee Details: " + john);
        john.setPhone("333-999-6666");
        // When we call save, it will save the current state and next revert will revert to this state
//        caretaker.save(john);
        caretaker.revert(john);

        System.out.println("Employee Details: " + john);
        caretaker.revert(john);
        System.out.println("Employee Detail: " + john);
    }
}

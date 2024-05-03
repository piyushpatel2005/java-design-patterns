package com.github.piyushpatel2005.memento.payroll.model;

/**
 * Memento class
 * It defines only getters that need to be saved into a state.
 * It also provides a method to save the state and revert the state.
 * Employee is not allowed to change their employeeId
 */
public class EmployeeMemento {
    private String name;
    private String address;
    private String phone;

    public EmployeeMemento(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String toString() {
        return name + " residing at " + address + " has phone number: " + phone;
    }
}

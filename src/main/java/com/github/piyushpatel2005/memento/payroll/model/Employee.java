package com.github.piyushpatel2005.memento.payroll.model;

/**
 * Employee class
 * It defines the state of the object that needs to be saved.
 */
public class Employee {
    private String employeeId;
    private String name;
    private String address;
    private String phone;

    public Employee(String employeeId, String name, String address, String phone) {
        this.employeeId = employeeId;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public Employee() {}

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public EmployeeMemento save() {
        return new EmployeeMemento(employeeId, name, phone);
    }

    public void revert(EmployeeMemento employee) {
        this.name = employee.getName();
        this.address = employee.getAddress();
        this.phone = employee.getPhone();
    }

    @Override
    public String toString() {
        return "Employeed ID: " + employeeId + " with name: " + name + " residing at " + address + " has phone number: " + phone;
    }

}

package com.github.piyushpatel2005.builder.vehicles.model;

public class ElectricCar extends Car {
    private String motorType;
    private int numberOfBatteries;

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public int getNumberOfBatteries() {
        return numberOfBatteries;
    }

    public void setNumberOfBatteries(int numberOfBatteries) {
        this.numberOfBatteries = numberOfBatteries;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting electric motor");
    }

    @Override
    public String toString() {
        return String.format("Electric car with %s motor with %d batteries, %d seats", this.getMotorType(), this.getNumberOfBatteries(), this.getNumberOfSeats());
    }
}

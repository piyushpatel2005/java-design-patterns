package com.github.piyushpatel2005.builder.vehicles.model;

public abstract class Car {
    private int numberOfSeats;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public abstract void startEngine();
}

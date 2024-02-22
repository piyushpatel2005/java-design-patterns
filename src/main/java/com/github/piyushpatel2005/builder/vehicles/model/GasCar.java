package com.github.piyushpatel2005.builder.vehicles.model;

public class GasCar extends Car {
    private String engineType;
    private int tankSize;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getTankSize() {
        return tankSize;
    }

    public void setTankSize(int tankSize) {
        this.tankSize = tankSize;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting gas engine");
    }

    @Override
    public String toString() {
        return String.format("Gas car with %s engine with %d gallons tank and %d seats", this.getEngineType(), this.getTankSize(), this.getNumberOfSeats());
    }
}

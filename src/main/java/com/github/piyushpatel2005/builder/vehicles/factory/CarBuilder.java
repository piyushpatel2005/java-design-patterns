package com.github.piyushpatel2005.builder.vehicles.factory;

import com.github.piyushpatel2005.builder.vehicles.model.Car;

public abstract class CarBuilder {
    public abstract CarBuilder buildSeats(int seats);
    public abstract CarBuilder buildEngine(String engineType);
    public abstract CarBuilder buildTank(int tankSize);
    public abstract CarBuilder addBatteries(int numberOfBatteries);
    public abstract CarBuilder addMotorType(String motorType);
    public abstract Car build();
}

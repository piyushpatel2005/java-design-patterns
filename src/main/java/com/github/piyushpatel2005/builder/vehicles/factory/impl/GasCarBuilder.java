package com.github.piyushpatel2005.builder.vehicles.factory.impl;

import com.github.piyushpatel2005.builder.vehicles.factory.CarBuilder;
import com.github.piyushpatel2005.builder.vehicles.model.Car;
import com.github.piyushpatel2005.builder.vehicles.model.GasCar;

public class GasCarBuilder extends CarBuilder {
    private GasCar car = new GasCar();

    @Override
    public CarBuilder buildSeats(int seats) {
        car.setNumberOfSeats(4);
        return this;
    }

    @Override
    public CarBuilder buildEngine(String engineType) {
        car.setEngineType("4-cylinder combustion");
        return this;
    }

    @Override
    public CarBuilder buildTank(int tankSize) {
        car.setTankSize(40);
        return this;
    }

    @Override
    public CarBuilder addBatteries(int numberOfBatteries) {
        return this;
    }

    @Override
    public CarBuilder addMotorType(String motorType) {
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}


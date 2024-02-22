package com.github.piyushpatel2005.builder.vehicles.factory.impl;

import com.github.piyushpatel2005.builder.vehicles.factory.CarBuilder;
import com.github.piyushpatel2005.builder.vehicles.model.Car;
import com.github.piyushpatel2005.builder.vehicles.model.ElectricCar;

public class ElectricCarBuilder extends CarBuilder {
    private ElectricCar car = new ElectricCar();

    @Override
    public CarBuilder buildSeats(int seats) {
        car.setNumberOfSeats(4);
        return this;
    }

    @Override
    public CarBuilder buildEngine(String engineType) {
        return this;
    }

    @Override
    public CarBuilder buildTank(int tankSize) {
        return this;
    }

    @Override
    public CarBuilder addBatteries(int numberOfBatteries) {
        car.setNumberOfBatteries(4);
        return this;
    }

    @Override
    public CarBuilder addMotorType(String motorType) {
        car.setMotorType("Brushless DC");
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}

package com.github.piyushpatel2005.builder.vehicles.factory;

import com.github.piyushpatel2005.builder.vehicles.factory.impl.ElectricCarBuilder;
import com.github.piyushpatel2005.builder.vehicles.model.Car;

public class CarDirector {
    public Car buildElectricCar(String motorType, int batteries) {
        return new ElectricCarBuilder()
                .buildSeats(4)
                .addBatteries(4)
                .addMotorType("Brushless DC")
                .build();
    }

    public Car buildGasCar(String engineType, int tankSize) {
        return new ElectricCarBuilder()
                .buildSeats(4)
                .buildEngine("4-cylinder combustion")
                .buildTank(30)
                .build();
    }
}

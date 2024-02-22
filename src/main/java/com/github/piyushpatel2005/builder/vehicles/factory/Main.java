package com.github.piyushpatel2005.builder.vehicles.factory;

import com.github.piyushpatel2005.builder.vehicles.model.Car;

public class Main {
    public static void main(String[] args) {
        CarDirector carDirector = new CarDirector();
        System.out.println("Create Electric Car");
        Car electricCar = carDirector.buildElectricCar("Brushless DC", 4);
        System.out.println(electricCar);

        System.out.println("=====================================");

        System.out.println("Create Gas Car");
        Car gasCar = carDirector.buildGasCar("4-cylinder combustion", 30);
        System.out.println(gasCar);
    }
}

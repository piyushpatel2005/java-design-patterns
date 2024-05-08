package com.github.piyushpatel2005.states.washingmachine;

public class ClientMain {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine(); // OffState
        System.out.println("Current state: " + washingMachine.getStatus()); // Off
        washingMachine.start(); // Select wash type first
        washingMachine.chooseCycle(); // Cycle selected
        System.out.println("Current state: " + washingMachine.getStatus()); // Cycle Selected
        washingMachine.openLid(); // Cannot open the door while cycle selected
        washingMachine.start(); // Starting the washing machine
        System.out.println("Current state: " + washingMachine.getStatus()); // Washing
        washingMachine.start(); // Already washing
    }
}

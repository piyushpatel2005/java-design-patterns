package com.github.piyushpatel2005.states.washingmachine.model;

import com.github.piyushpatel2005.states.washingmachine.WashingMachine;

public class OffState implements WashingMachineState {
    @Override
    public void start(WashingMachine machine) {
        System.out.println("Select wash type first");
    }

    @Override
    public void chooseCycle(WashingMachine machine) {
        System.out.println("Cycle selected");
        machine.setState(machine.getWashingState());
    }

    @Override
    public void pause(WashingMachine machine) {
        System.out.println("Machine is already off so cannot pause.");
    }

    @Override
    public void stop(WashingMachine machine) {
        System.out.println("Machine is already off so cannot stop.");
    }

    @Override
    public void openDoor(WashingMachine machine) {
        System.out.println("You can open the doors.");
    }

    @Override
    public String getStatus() {
        return "Off";
    }
}

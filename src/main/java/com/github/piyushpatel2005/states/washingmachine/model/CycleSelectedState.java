package com.github.piyushpatel2005.states.washingmachine.model;

import com.github.piyushpatel2005.states.washingmachine.WashingMachine;

public class CycleSelectedState implements WashingMachineState {
    @Override
    public void start(WashingMachine machine) {
        System.out.println("Starting the washing machine");
        machine.setState(machine.getWashingState());
    }

    @Override
    public void chooseCycle(WashingMachine machine) {
        System.out.println("Cycle selected");
    }

    @Override
    public void pause(WashingMachine machine) {
        System.out.println("Cannot pause while cycle selected");
    }

    @Override
    public void stop(WashingMachine machine) {
        System.out.println("Stopping the washing machine");
        machine.setState(machine.getOffState());
    }

    @Override
    public void openDoor(WashingMachine machine) {
        System.out.println("Cannot open the door while cycle selected");
    }

    @Override
    public String getStatus() {
        return "Cycle Selected";
    }
}

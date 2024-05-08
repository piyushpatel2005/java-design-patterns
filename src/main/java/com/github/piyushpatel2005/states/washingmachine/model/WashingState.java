package com.github.piyushpatel2005.states.washingmachine.model;

import com.github.piyushpatel2005.states.washingmachine.WashingMachine;

public class WashingState implements WashingMachineState {
    @Override
    public void start(WashingMachine machine) {
        System.out.println("Already washing");
    }

    public void chooseCycle(WashingMachine machine) {
        System.out.println("Already washing");
    }

    @Override
    public void pause(WashingMachine machine) {
        System.out.println("Pausing the washing machine");
        machine.setState(machine.getPauseState());
    }

    @Override
    public void stop(WashingMachine machine) {
        System.out.println("Stopping the washing machine");
        machine.setState(machine.getOffState());
    }

    @Override
    public void openDoor(WashingMachine machine) {
        System.out.println("Cannot open the door while washing");
    }

    @Override
    public String getStatus() {
        return "Washing";
    }
}

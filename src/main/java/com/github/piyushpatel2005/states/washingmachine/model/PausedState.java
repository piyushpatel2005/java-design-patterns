package com.github.piyushpatel2005.states.washingmachine.model;

import com.github.piyushpatel2005.states.washingmachine.WashingMachine;

public class PausedState implements WashingMachineState {
    @Override
    public void start(WashingMachine machine) {
        System.out.println("Resuming the washing machine");
        machine.setState(machine.getWashingState());
    }

    @Override
    public void chooseCycle(WashingMachine machine) {
        System.out.println("Cannot choose cycle while paused");
    }

    @Override
    public void pause(WashingMachine machine) {
        System.out.println("Already paused");
    }

    @Override
    public void stop(WashingMachine machine) {
        System.out.println("Stopping the washing machine");
        machine.setState(machine.getOffState());
    }

    @Override
    public void openDoor(WashingMachine machine) {
        System.out.println("You can open the door now.");
    }

    @Override
    public String getStatus() {
        return "Paused";
    }
}

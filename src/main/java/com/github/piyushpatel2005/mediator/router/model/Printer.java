package com.github.piyushpatel2005.mediator.router.model;

public class Printer implements Device {
    private final String name;
    private final Mediator mediator;

    public Printer(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void send(String message) {
        System.out.println(name + " sends: " + message);
        mediator.send(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " received: " + message);
    }

    public void print(String file) {
        System.out.println("Printing file : " + file);
    }
}

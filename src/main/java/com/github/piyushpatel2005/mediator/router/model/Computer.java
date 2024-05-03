package com.github.piyushpatel2005.mediator.router.model;

public class Computer implements Device{
    private final String name;
    private final Mediator mediator;

    public Computer(String name, Mediator mediator) {
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

    public void browse(String url) {
        System.out.println("Browsing url : " + url);
    }

    public void download(String file) {
        System.out.println("Downloading file : " + file);
    }
}

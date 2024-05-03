package com.github.piyushpatel2005.mediator.router;

import com.github.piyushpatel2005.mediator.router.model.*;

public class ClientMain {
    public static void main(String[] args) {
        Mediator mediator = new HubRouter();
        Device computer = new Computer("Dell Laptop", mediator);
        Device printer = new Printer("HP Printer", mediator);

        mediator.register(computer);
        mediator.register(printer);

        computer.send("Hello, Print this document");
        printer.send("Finished printing document");
    }
}

package com.github.piyushpatel2005.mediator.lights;

import com.github.piyushpatel2005.mediator.lights.model.BedroomLight;
import com.github.piyushpatel2005.mediator.lights.model.KitchenLight;
import com.github.piyushpatel2005.mediator.lights.model.Light;
import com.github.piyushpatel2005.mediator.lights.model.command.OffCommand;
import com.github.piyushpatel2005.mediator.lights.model.command.OnCommand;
import com.github.piyushpatel2005.mediator.lights.model.mediator.LightController;
import com.github.piyushpatel2005.mediator.lights.model.mediator.MediatorController;

public class Main {
    public static void main(String[] args) {
        MediatorController lightMediator = new LightController();
        Light bedroomLight = new BedroomLight();
        Light kitchenLight = new KitchenLight();
        lightMediator.registerLight("Bedroom", kitchenLight);
        lightMediator.registerLight("Kitchen", bedroomLight);

        lightMediator.sendCommand("Bedroom", new OnCommand(bedroomLight));
        lightMediator.sendCommand("Kitchen", new OnCommand(kitchenLight));
        lightMediator.sendCommand("Bedroom", new OffCommand(bedroomLight));
    }
}

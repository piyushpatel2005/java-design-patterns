package pluralsight.state.domain;

import pluralsight.state.Fan;
import pluralsight.state.domain.State;

public class FanMedState extends State {

    private Fan fan;

    public FanMedState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to high.");
        fan.setState(fan.getFanHighState());
    }

    public String toString() {
        return "Fan is medium";
    }
}

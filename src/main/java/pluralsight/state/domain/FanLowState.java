package pluralsight.state.domain;

import pluralsight.state.Fan;
import pluralsight.state.domain.State;

public class FanLowState extends State {

    private Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to medium.");
        fan.setState(fan.getFanMedState());
    }

    public String toString() {
        return "Fan is low";
    }
}

package pluralsight.state.domain;

import pluralsight.state.Fan;
import pluralsight.state.domain.State;

public class FanHighState extends State {

    private Fan fan;

    public FanHighState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan off.");

        // pluralsight.state should not transition itself. The pluralsight.state machine should be aware of possible states not another pluralsight.state.
        // So, choose to delegate to the pluralsight.state machine instead of directly creating new pluralsight.state here.
        fan.setState(fan.getFanOffState());
    }

    public String toString() {
        return "Fan is high";
    }
}

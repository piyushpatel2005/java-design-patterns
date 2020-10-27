package state;

public class FanHighState extends State {

    private Fan fan;

    public FanHighState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan off.");

        // state should not transition itself. The state machine should be aware of possible states not another state.
        // So, choose to delegate to the state machine instead of directly creating new state here.
        fan.setState(fan.getFanOffState());
    }

    public String toString() {
        return "Fan is high";
    }
}

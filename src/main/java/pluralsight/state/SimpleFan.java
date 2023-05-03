package pluralsight.state;

public class SimpleFan {

    final static int OFF = 0;
    final static int LOW = 1;
    final static int MED = 2; // adding pluralsight.state requires adding if..else block in below methods

    int state = OFF; // what will be next pluralsight.state when we pull chain of fan

    public SimpleFan() {

    }

    public void pullChain() {
        if (state == OFF) {
            System.out.println("Turning fan on to low.");
            state = LOW;
        } else if (state == LOW) {
            System.out.println("Turning fan on to medium.");
            state = MED;
        } else if (state == MED) {
            System.out.println("Turning fan off.");
            state = OFF;
        }
    }

    public String toString() {
        if(state == OFF) {
            return "Fan is off";
        } else if (state == LOW) {
            return "Fan is on low";
        } else if (state == MED) {
            return "Fan is on medium";
        }
        return "Invalid pluralsight.state";
    }
}

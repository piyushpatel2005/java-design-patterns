package pluralsight.mediator;

import java.util.Timer;
import java.util.TimerTask;

public class MediatorSimpleDemo {

    private Timer timer;

    public MediatorSimpleDemo(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1);
    }

    class RemindTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("Time's up");
        }
    }

    class RemindTaskWithoutBeep extends TimerTask {

        @Override
        public void run() {
            System.out.println("Now Time's really up");
            timer.cancel();
        }
    }

    public static void main(String[] args) {
        System.out.println("About to schedule task.");
        new MediatorSimpleDemo(3);
        System.out.println("Task scheduled");
    }
}

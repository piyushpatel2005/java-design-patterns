package observer;


public class TabletClient extends Observer {

    public TabletClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message + " - send from tablet");
    }

    @Override
    void update() {
        System.out.println("Tablet Stream: " + subject.getState());
    }
}

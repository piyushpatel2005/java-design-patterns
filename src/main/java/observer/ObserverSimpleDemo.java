package observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverSimpleDemo {

    public static void main(String[] args) {
        TwitterStream messageStream = new TwitterStream();

        Client client1 = new Client("XYZ");
        Client client2 = new Client("ABC");

        messageStream.addObserver(client1);
        messageStream.addObserver(client2);

        messageStream.someoneTweeted();
    }
}

// concrete subject
class TwitterStream extends Observable {

    public void someoneTweeted() {
        setChanged();
        notifyObservers();
    }
}


// concrete observer
class Client implements Observer {
    private String name;

    Client(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Update " + name + "'s stream, someone tweeted something.");
    }
}
package pluralsight.singleton;

public class NonThreadSafeSingleton {

    private static NonThreadSafeSingleton instance = null;

    private NonThreadSafeSingleton() {}

    public static NonThreadSafeSingleton getInstance() {
        if(instance == null) {
            instance = new NonThreadSafeSingleton();
        }

        return instance;
    }
}

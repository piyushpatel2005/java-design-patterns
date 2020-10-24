package singleton;

public class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton instance = null;

    // avoid reflection on code
    private ThreadSafeSingleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create an instance");
        }
    }

    public static ThreadSafeSingleton getInstance() {
        if(instance == null) {
            // avoid performance hit using synchronized here
            synchronized (ThreadSafeSingleton.class) {
                // reverify if no other thread has created this instance
                if (instance == null)
                    instance = new ThreadSafeSingleton();
            }
        }

        return instance;
    }
}
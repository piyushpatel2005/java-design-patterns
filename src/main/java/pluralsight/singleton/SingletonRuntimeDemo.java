package pluralsight.singleton;

public class SingletonRuntimeDemo {
    public static void main(String[] args) {
        Runtime singletonRuntime = Runtime.getRuntime();

        singletonRuntime.gc();

        System.out.println(singletonRuntime);

        Runtime anotherInstance = Runtime.getRuntime();

        anotherInstance.gc();

        System.out.println(anotherInstance);

        if(singletonRuntime == anotherInstance) {
            System.out.println("Both are the same");
        }
    }
}

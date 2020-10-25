package flyweight;

public class FlyweightSimpleDemo {

    public static void main(String[] args) {
        // Create and store it in literal pool
        Integer firstInt = Integer.valueOf(5);

        // retrieve from Flyweight cache, so it will have same hash code.
        Integer secondInt = Integer.valueOf(5);

        Integer thirdInt = Integer.valueOf(5);

        System.out.println(System.identityHashCode(firstInt));
        System.out.println(System.identityHashCode(secondInt));
        System.out.println(System.identityHashCode(thirdInt));
    }
}

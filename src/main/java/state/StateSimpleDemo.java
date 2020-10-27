package state;

public class StateSimpleDemo {
    public static void main(String[] args) {
        SimpleFan fan = new SimpleFan();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);
    }

}

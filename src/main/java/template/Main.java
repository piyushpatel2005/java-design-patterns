package template;

public class Main {
    public static void main(String[] args) {

        System.out.println("Web Order:");

        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();

        System.out.println("\nStore Order:");

        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();
    }
}

package visitor.withpattern;

public class Main {

    public static void main(String[] args) {

        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());

        order.accept(new AtvPartsShippingVisitor());
        // adding new functionality simply requires visitor class and nothing else
        order.accept(new AtvPartsDisplayVisitor());
    }
}

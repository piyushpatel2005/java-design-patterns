package pluralsight.builder;

import pluralsight.builder.model.LunchOrderTele;

public class LunchOrderTeleDemo {
    public static void main(String[] args) {

        LunchOrderTele lunchOrderTele = new LunchOrderTele("Wheat", "Lettuce", "Mustard", "Ham");

        // constructors are not available, so it is immutable but still it has its own problems
        // lunchOrderTele.setBread("Wheat");
        // lunchOrderTele.setCondiments("Lettuce");
        // lunchOrderTele.setDressing("Mustard");
        // lunchOrderTele.setMeat("Ham");

        System.out.println(lunchOrderTele.getBread());
        System.out.println(lunchOrderTele.getCondiments());
        System.out.println(lunchOrderTele.getDressing());
        System.out.println(lunchOrderTele.getMeat());
    }
}

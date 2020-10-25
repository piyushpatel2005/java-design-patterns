package builder;

public class SimpleDemo {
    public static void main(String[] args) {

        // This is immutable
        LunchOrderBean lunchOrderBean = new LunchOrderBean();

        // There is no valid constract for lunch order, even if everything is removed from lunch, it is still accepted as valid order.
//		lunchOrderBean.setBread("Wheat");
//		lunchOrderBean.setCondiments("Lettuce");
//		lunchOrderBean.setDressing("Mustard");
//		lunchOrderBean.setMeat("Ham");

		System.out.println(lunchOrderBean.getBread());
		System.out.println(lunchOrderBean.getCondiments());
		System.out.println(lunchOrderBean.getDressing());
		System.out.println(lunchOrderBean.getMeat());

    }
}

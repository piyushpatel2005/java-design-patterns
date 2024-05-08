package pluralsight.template.domain;

public abstract class OrderTemplate {

    public boolean isGift;
    public abstract void doCheckout();
    public abstract void doPayment();
    public abstract void doReceipt();
    public abstract void doDelivery();

    public final void wrapGift() {
        System.out.println("Gift was wrapped.");
    }

    // pluralsight.template method, must not be overridden, hence final
    public final void processOrder() {
        doCheckout();
        doPayment();
        if(isGift) {
            wrapGift();
        }
        doReceipt();
        doDelivery();
    }
}
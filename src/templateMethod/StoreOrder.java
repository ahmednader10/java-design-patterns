package templateMethod;

public class StoreOrder extends OrderTemplate {

    public void doCheckout() {
        System.out.println("checking out in store");
    }

    public void doPayment() {
        System.out.println("doing payment in store");
    }

    public void doReceipt() {
        System.out.println("doing receipt in store");
    }

    public void doDelivery() {
        System.out.println("doing delivery from store");
    }
}
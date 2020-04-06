package templateMethod;

public class WebOrder extends OrderTemplate {

    public void doCheckout() {
        System.out.println("checking out");
    }

    public void doPayment() {
        System.out.println("doing payment");
    }

    public void doReceipt() {
        System.out.println("doing receipt");
    }

    public void doDelivery() {
        System.out.println("doing delivery");
    }
}

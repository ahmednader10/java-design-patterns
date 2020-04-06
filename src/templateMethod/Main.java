package templateMethod;

public class Main {
    public static void main(String[]args) {
        System.out.println("Web Order: ");
        OrderTemplate order = new WebOrder();

        order.processOrder();

        System.out.println("Store Order: ");
        OrderTemplate order1 = new StoreOrder();
        order1.processOrder();
    }
}

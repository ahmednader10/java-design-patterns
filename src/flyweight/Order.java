package flyweight;

public class Order {

    private final int orderNumer;
    private final Item item;

    public Order(int orderNumer, Item item) {
        this.orderNumer = orderNumer;
        this.item = item;
    }

    void processOrder() {
        System.out.println("order "+item + " with number "+orderNumer);
    }
}

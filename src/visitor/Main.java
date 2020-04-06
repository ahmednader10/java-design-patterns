package visitor;

public class Main {

    public static void main(String[]args) {
        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Oil());
        order.addPart(new Fender());

        order.accept(new AtvPartsShippingVisitor());
        order.accept(new AtvPartsDisplayVisitor());
    }
}

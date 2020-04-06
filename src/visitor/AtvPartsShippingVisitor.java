package visitor;

public class AtvPartsShippingVisitor implements AtvPartVisitor {

    double shippingAmount = 0;

    public void visit(Oil partVisitor) {
        shippingAmount += 15;
        System.out.println("add oil");
    }
    public void visit(Fender partVisitor) {
        shippingAmount += 25;
        System.out.println("add fender");
    }
    public void visit(PartsOrder partVisitor) {
        shippingAmount += 35;
        System.out.println("add parts order");
    }
    public void visit(Wheel partVisitor) {
        shippingAmount += 45;
        System.out.println("add wheel");
    }
}

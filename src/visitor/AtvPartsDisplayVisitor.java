package visitor;

public class AtvPartsDisplayVisitor implements AtvPartVisitor {

    public void visit(Oil partVisitor) {
        System.out.println("displaying oil");
    }
    public void visit(Fender partVisitor) {
        System.out.println("displaying fender");
    }
    public void visit(PartsOrder partVisitor) {
        System.out.println("displaying order");
    }
    public void visit(Wheel partVisitor) {
        System.out.println("displaying wheel");
    }
}

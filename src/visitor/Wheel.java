package visitor;

public class Wheel implements AtvPart {

    public void accept(AtvPartVisitor partVisitor) {
        partVisitor.visit(this);
    }
}
package visitor;

public class Fender implements AtvPart {

    public void accept(AtvPartVisitor partVisitor) {
        partVisitor.visit(this);
    }
}
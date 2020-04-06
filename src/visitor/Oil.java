package visitor;

public class Oil implements AtvPart {

    public void accept(AtvPartVisitor partVisitor) {
        partVisitor.visit(this);
    }
}

package visitor;

public interface AtvPartVisitor {

    void visit(Oil partVisitor);
    void visit(Fender partVisitor);
    void visit(PartsOrder partVisitor);
    void visit(Wheel partVisitor);
}

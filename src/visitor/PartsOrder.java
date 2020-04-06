package visitor;

import java.util.ArrayList;
import java.util.List;

public class PartsOrder implements AtvPart {

    List<AtvPart> parts = new ArrayList<>();

    public void addPart(AtvPart part) {
        parts.add(part);
    }

    public void accept(AtvPartVisitor partVisitor) {
        for(AtvPart part: parts) {
            part.accept(partVisitor);
        }
        partVisitor.visit(this);
    }
}
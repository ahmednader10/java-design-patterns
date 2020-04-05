package decorator;

public class SimpleSandwich implements Sandwich {

    public SimpleSandwich() {

    }

    @Override
    public String make() {
        return "Bread";
    }
}

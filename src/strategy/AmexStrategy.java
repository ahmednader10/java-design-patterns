package strategy;

public class AmexStrategy extends ValidationStrategy {

    @Override
    public boolean isValid(CreditCard card) {
        return card.getNumber().startsWith("23");
    }
}

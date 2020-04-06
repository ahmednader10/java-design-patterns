package strategy;

public class VisaStrategy extends ValidationStrategy {

    @Override
    public boolean isValid(CreditCard card) {
        return card.getNumber().startsWith("31");
    }
}


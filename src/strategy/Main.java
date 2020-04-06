package strategy;

public class Main {

    public static void main(String[]args) {
        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("234911141");
        amexCard.setDate("02/2020");
        amexCard.setCvv("231");

        System.out.println("is amex card valid: "+amexCard.isValid());
    }
}

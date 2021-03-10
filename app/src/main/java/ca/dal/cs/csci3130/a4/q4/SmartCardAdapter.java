package ca.dal.cs.csci3130.a4.q4;

public class SmartCardAdapter implements IDebitCard {
    ICreditCard creditCard;

    public SmartCardAdapter(ICreditCard creditCard) {
        //missing code
        this.creditCard = creditCard;
    }

    @Override
    public boolean pay(String paymentType, int amount) {
        //missing code + buggy code
        if (paymentType.equalsIgnoreCase(CardConstants.CREDIT_PAYMENT)){
            new MasterCard().payInCredit(amount);

        } else if (paymentType.equalsIgnoreCase(CardConstants.DEBIT_PAYMENT)) {
            new SmartCard(this);
        }
        return true;
    }
}

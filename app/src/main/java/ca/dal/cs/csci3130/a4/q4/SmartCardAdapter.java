package ca.dal.cs.csci3130.a4.q4;

public class SmartCardAdapter implements IDebitCard {
    ICreditCard creditCard;

    public SmartCardAdapter(ICreditCard creditCard) {
        //missing code
    }

    @Override
    public boolean pay(String paymentType, int amount) {
        //missing code + buggy code
        return false;
    }
}

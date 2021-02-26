package ca.dal.cs.csci3130.a4.q4;

public class MasterCard implements ICreditCard {

    @Override
    public boolean payInCredit(int amount) {
        //buggy code
        System.out.println("Paid by Mastercard: " + amount);
        return false;
    }
}

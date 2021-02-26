package ca.dal.cs.csci3130.a4.q1;

import ca.dal.cs.csci3130.a4.q2.LoyaltyCard;

public class Customer implements ICustomer {

    final double DISCOUNT_RATE = 0.05;
    String firsName;
    String lastName;
    LoyaltyCard loyaltyCard;

    public Customer(String firsName, String lastName) {
        this.firsName = firsName;
        this.lastName = lastName;
    }

    @Override
    public LoyaltyCard getLoyaltyCard() {
        return this.loyaltyCard;
    }

    @Override
    public void setLoyaltyCard(LoyaltyCard loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
    }

    @Override
    public double calculateDiscount() {
        double points = loyaltyCard.getCurrentPoints();
        return points * DISCOUNT_RATE;
    }
}

package ca.dal.cs.csci3130.a4.q1;

import ca.dal.cs.csci3130.a4.q2.LoyaltyCard;

public interface ICustomer {
    public void setLoyaltyCard(LoyaltyCard loyaltyCard);
    public LoyaltyCard getLoyaltyCard();
    public double calculateDiscount();
}

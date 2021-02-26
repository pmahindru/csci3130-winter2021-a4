package ca.dal.cs.csci3130.a4.q1;

import ca.dal.cs.csci3130.a4.q2.LoyaltyCard;

public class CustomerSRP implements ICustomer {

    String firsName;
    String lastName;
    LoyaltyCard loyaltyCard;
    Membership membership;

    public CustomerSRP(String firsName, String lastName) {
        this.firsName = firsName;
        this.lastName = lastName;
    }

    public LoyaltyCard getLoyaltyCard() {
        return this.loyaltyCard;
    }

    public void setLoyaltyCard(LoyaltyCard loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
    }

    protected Membership getMembership() {
        return this.membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public double calculateDiscount() {
        return this.membership.getRule().calculate(this);
    }
}

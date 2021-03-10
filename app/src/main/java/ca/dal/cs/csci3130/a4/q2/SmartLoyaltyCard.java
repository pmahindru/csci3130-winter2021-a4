package ca.dal.cs.csci3130.a4.q2;

public class SmartLoyaltyCard implements ILoyaltyCard {

    int currentPoints;

    public SmartLoyaltyCard(int points) {
        //missing code
        this.currentPoints = points;
    }

    public void performTransaction(Transaction transaction) {
        //missing code
        transaction.performTransaction(this);
    }

    public int getCurrentPoints() {
        return this.currentPoints;
    }

    public void setCurrentPoints(int points) {
        this.currentPoints = points;
    }
}


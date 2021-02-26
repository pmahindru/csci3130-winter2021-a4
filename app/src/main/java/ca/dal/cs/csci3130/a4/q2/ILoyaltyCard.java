package ca.dal.cs.csci3130.a4.q2;

public interface ILoyaltyCard {
    public void performTransaction(Transaction transaction);

    public int getCurrentPoints();

    public void setCurrentPoints(int points);
}

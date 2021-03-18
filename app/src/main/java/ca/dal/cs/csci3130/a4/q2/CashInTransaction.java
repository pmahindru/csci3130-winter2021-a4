package ca.dal.cs.csci3130.a4.q2;

public class CashInTransaction implements Transaction {
    int point2Cash;
    int MINIMUM_POINTS = 500;

    public CashInTransaction(int point2Cash) {
        //missing code
        this.point2Cash = point2Cash;
    }

    public void performTransaction(ILoyaltyCard card) {
        //missing code
        if (card.getCurrentPoints() > MINIMUM_POINTS && card.getCurrentPoints() > point2Cash){
            card.setCurrentPoints(card.getCurrentPoints()-point2Cash);
        }
    }
}

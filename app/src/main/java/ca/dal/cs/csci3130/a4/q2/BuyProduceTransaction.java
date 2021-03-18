package ca.dal.cs.csci3130.a4.q2;


public class BuyProduceTransaction implements Transaction {

    int points2Buy;
    int MINIMUM_POINTS = 500;

    public BuyProduceTransaction(int points2Buy) {
        //missing code
        this.points2Buy = points2Buy;
    }

    @Override
    public void performTransaction(ILoyaltyCard card) {
        //missing code
        if (card.getCurrentPoints() > MINIMUM_POINTS && card.getCurrentPoints() > points2Buy){
            card.setCurrentPoints(card.getCurrentPoints()-points2Buy);
        }
    }


}

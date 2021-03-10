package ca.dal.cs.csci3130.a4.q2;

public class TransferTransaction implements Transaction {

    ILoyaltyCard card;

    public TransferTransaction(ILoyaltyCard card) {
        //missing code
        this.card = card;
    }

    @Override
    public void performTransaction(ILoyaltyCard card) {
        //missing code

        //receiver
        this.card.setCurrentPoints(card.getCurrentPoints() + this.card.getCurrentPoints());
        //sender
        card.setCurrentPoints(card.getCurrentPoints() - card.getCurrentPoints());
    }
}

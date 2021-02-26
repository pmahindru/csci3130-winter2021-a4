package ca.dal.cs.csci3130.a4;

import org.junit.Test;

import ca.dal.cs.csci3130.a4.q2.ILoyaltyCard;
import ca.dal.cs.csci3130.a4.q2.LoyaltyCard;
import ca.dal.cs.csci3130.a4.q2.BuyProduceTransaction;
import ca.dal.cs.csci3130.a4.q2.CashInTransaction;
import ca.dal.cs.csci3130.a4.q2.SmartLoyaltyCard;
import ca.dal.cs.csci3130.a4.q2.Transaction;
import ca.dal.cs.csci3130.a4.q2.TransferTransaction;
import static org.junit.Assert.*;

public class LoyaltyCardTest {

    @Test
    public void testOldCardOperations() {
        LoyaltyCard card = new LoyaltyCard(10000);
        card.performTransaction(1,500,null);
        assertEquals(9500, card.getCurrentPoints());

        LoyaltyCard secondCard=new LoyaltyCard(0);
        assertTrue(card.transfer(secondCard));
        assertEquals(0, card.getCurrentPoints());
        assertEquals(9500,secondCard.getCurrentPoints());
    }

    @Test
    public void testCashIn(){
        ILoyaltyCard card=new SmartLoyaltyCard(1000);
        Transaction transaction=new CashInTransaction(100);
        card.performTransaction(transaction);
        assertEquals(900,card.getCurrentPoints());
    }

    @Test
    public void testTransfer(){
        ILoyaltyCard firstCard=new SmartLoyaltyCard(1000);
        ILoyaltyCard secondCard=new SmartLoyaltyCard(0);
        Transaction transaction=new TransferTransaction(secondCard);
        firstCard.performTransaction(transaction);
        assertEquals(0,firstCard.getCurrentPoints());
        assertEquals(1000, secondCard.getCurrentPoints());
    }

    @Test
    public void testBuyProduce(){
        ILoyaltyCard card= new SmartLoyaltyCard(1000);
        Transaction transaction=new BuyProduceTransaction(200);
        card.performTransaction(transaction);
        assertEquals(800,card.getCurrentPoints());
    }

    @Test
    public void testAllTransactions(){
        ILoyaltyCard firstCard=new SmartLoyaltyCard(1000);
        ILoyaltyCard secondCard=new SmartLoyaltyCard(0);
        Transaction cashIn=new CashInTransaction(100);
        firstCard.performTransaction(cashIn);
        assertEquals(900,firstCard.getCurrentPoints());

        Transaction buyProduce=new BuyProduceTransaction(200);
        firstCard.performTransaction(buyProduce);
        assertEquals(700,firstCard.getCurrentPoints());

        Transaction transfer=new TransferTransaction(secondCard);
        firstCard.performTransaction(transfer);
        assertEquals(0,firstCard.getCurrentPoints());
        assertEquals(700, secondCard.getCurrentPoints());
    }

}

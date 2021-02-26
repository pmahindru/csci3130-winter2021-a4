package ca.dal.cs.csci3130.a4;

import org.junit.Test;
import ca.dal.cs.csci3130.a4.q4.CardConstants;
import ca.dal.cs.csci3130.a4.q4.ICreditCard;
import ca.dal.cs.csci3130.a4.q4.MasterCard;
import ca.dal.cs.csci3130.a4.q4.SmartCard;
import ca.dal.cs.csci3130.a4.q4.SmartCardAdapter;
import static org.junit.Assert.assertTrue;

public class SmartCardTest {

    @Test
    public void testSmartCardOperation() {
        ICreditCard masterCard = new MasterCard();
        SmartCardAdapter adapter = new SmartCardAdapter(masterCard);
        SmartCard smartCard = new SmartCard(adapter);
        assertTrue(smartCard.pay(CardConstants.DEBIT_PAYMENT, 100));
        assertTrue(smartCard.pay(CardConstants.CREDIT_PAYMENT, 200));
    }
}

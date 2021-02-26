package ca.dal.cs.csci3130.a4;

import org.junit.Test;
import ca.dal.cs.csci3130.a4.q2.LoyaltyCard;
import ca.dal.cs.csci3130.a4.q1.CustomerSRP;
import ca.dal.cs.csci3130.a4.q1.Customer;
import ca.dal.cs.csci3130.a4.q1.DiscountCalculator;
import ca.dal.cs.csci3130.a4.q1.ICustomer;
import ca.dal.cs.csci3130.a4.q1.Membership;
import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void testCustomer(){
        ICustomer customer=new Customer("John","Doe");
        LoyaltyCard loyaltyCard=new LoyaltyCard(1000);
        customer.setLoyaltyCard(loyaltyCard);
        assertEquals(50,(int)customer.calculateDiscount());
        assertNotEquals(100,(int)customer.calculateDiscount());
    }

    @Test
    public void testCustomerWithSRP(){
        CustomerSRP customer=new CustomerSRP("Jane","Doe");
        LoyaltyCard loyaltyCard=new LoyaltyCard(1000);
        customer.setLoyaltyCard(loyaltyCard);

        DiscountCalculator discountCalculator1=new DiscountCalculator(.05);
        Membership membership1=new Membership(discountCalculator1);
        customer.setMembership(membership1);
        assertEquals(50,(int)customer.calculateDiscount());

        DiscountCalculator discountCalculator2=new DiscountCalculator(.10);
        Membership membership2=new Membership(discountCalculator2);
        customer.setMembership(membership2);
        assertEquals(100,(int)customer.calculateDiscount());
    }
}

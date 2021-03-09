package ca.dal.cs.csci3130.a4.q1;

public class DiscountCalculator implements DiscountCalculationRule {

    double discountRate;

    public DiscountCalculator(double discountRate) {
        //missing code
        this.discountRate = discountRate;
    }

    @Override
    public double calculate(CustomerSRP customer) {
        //buggy code
        return discountRate * customer.getLoyaltyCard().getCurrentPoints();
    }
}

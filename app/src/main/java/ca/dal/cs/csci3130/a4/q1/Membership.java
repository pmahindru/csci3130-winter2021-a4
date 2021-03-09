package ca.dal.cs.csci3130.a4.q1;

public class Membership {
    private DiscountCalculationRule rule;

    public Membership(DiscountCalculationRule rule) {
        //required code missing
        this.rule = rule;
    }

    protected DiscountCalculationRule getRule() {
        //buggy code
        return rule;
    }
}

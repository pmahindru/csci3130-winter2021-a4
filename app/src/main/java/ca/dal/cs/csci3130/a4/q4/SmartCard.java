package ca.dal.cs.csci3130.a4.q4;

public class SmartCard implements IDebitCard {
    SmartCardAdapter adapter;

    public SmartCard(SmartCardAdapter adapter) {
        //missing code
        this.adapter = adapter;
    }

    @Override
    public boolean pay(String paymentType, int amount) {
        boolean paid = true;
        if (paymentType.equalsIgnoreCase(CardConstants.CREDIT_PAYMENT)){
            adapter.pay(CardConstants.CREDIT_PAYMENT,amount);

        } else if (paymentType.equalsIgnoreCase(CardConstants.DEBIT_PAYMENT)) {
            System.out.println("DEBIT_PAYMENT " + amount);
        }
        return paid;
    }
}

package ca.dal.cs.csci3130.a4.q5;

public class User extends Observer {

    int bidIncrement = 0;
    int currentPrice;
    String currentMessage;

    public User(IPreferenceManager manager, int bidIncrement) {
        //missing code
    }

    @Override
    public void update(int newPrice) {
        //missing code
    }

    @Override
    public void update(String message) {
        //missing code
    }

    @Override
    public int getCurrentPrice() {
        return this.currentPrice;
    }

    @Override
    public String getCurrentMessage() {
        return this.currentMessage;
    }
}

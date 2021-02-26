package ca.dal.cs.csci3130.a4.q5;

import java.util.ArrayList;
import java.util.List;

public class TaskPreferenceManager implements IPreferenceManager {
    private List<Observer> users = new ArrayList<>();
    private int price;

    @Override
    public void attach(Observer user) {
        //missing code
    }

    public int getPrice() {
        //buggy code
        return 0;
    }

    public void setPrice(int currentPrice) {
        //missing code
    }

    @Override
    public void notifyAllUsers() {
        //missing code
    }
}

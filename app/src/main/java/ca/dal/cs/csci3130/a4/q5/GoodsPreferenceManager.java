package ca.dal.cs.csci3130.a4.q5;

import java.util.ArrayList;
import java.util.List;

public class GoodsPreferenceManager implements IPreferenceManager {

    private List<Observer> users = new ArrayList<>();
    private String message;

    @Override
    public void attach(Observer user) {
        //missing code
        users.add(user);
    }

    public void setMessage(String message) {
        //missing code
        this.message = message;
        notifyAllUsers();
    }

    @Override
    public void notifyAllUsers() {
        //missing code
        for (Observer user : users){
            user.update(message);
        }
    }

}

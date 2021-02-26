package ca.dal.cs.csci3130.a4.q5;

public abstract class Observer {

    public IPreferenceManager manager;

    public abstract void update(int newPrice);

    public abstract void update(String message);

    public abstract int getCurrentPrice();

    public abstract String getCurrentMessage();
}

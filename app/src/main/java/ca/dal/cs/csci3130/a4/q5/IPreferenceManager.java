package ca.dal.cs.csci3130.a4.q5;

public interface IPreferenceManager {
    public void attach(Observer user);

    public void notifyAllUsers();
}

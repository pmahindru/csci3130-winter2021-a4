package ca.dal.cs.csci3130.a4;

import org.junit.Test;
import ca.dal.cs.csci3130.a4.q5.GoodsPreferenceManager;
import ca.dal.cs.csci3130.a4.q5.Observer;
import ca.dal.cs.csci3130.a4.q5.TaskPreferenceManager;
import ca.dal.cs.csci3130.a4.q5.User;
import static org.junit.Assert.assertEquals;

public class NotificationManagerTest {

    @Test
    public void testSendNewBid() {
        TaskPreferenceManager manager = new TaskPreferenceManager();
        Observer user1 = new User(manager, 10);
        Observer user2 = new User(manager, 20);

        manager.setPrice(100);
        assertEquals(110, user1.getCurrentPrice());
        assertEquals(120, user2.getCurrentPrice());
    }

    @Test
    public void testSendNewNotification() {
        GoodsPreferenceManager manager = new GoodsPreferenceManager();
        Observer user3 = new User(manager, 0);
        Observer user4 = new User(manager, 0);

        manager.setMessage("Baby toy");
        assertEquals("Baby toy", user3.getCurrentMessage());
        assertEquals("Baby toy", user4.getCurrentMessage());
    }
}

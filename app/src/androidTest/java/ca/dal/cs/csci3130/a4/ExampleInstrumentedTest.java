package ca.dal.cs.csci3130.a4;

import android.content.Context;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.content.Context;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.hamcrest.core.AllOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import ca.dal.cs.csci3130.a4.q3.ItemConstants;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.not;

import static org.junit.Assert.*;


import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityScenarioRule<MainActivity> myRule = new ActivityScenarioRule<>(MainActivity.class);


    @Test
    public void testSendNewBid100(){
        //selecting a task
        onView(withId(R.id.itemSelector)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is(ItemConstants.WALK_A_DOG))).perform(click());
        //adding a new bid
        onView(withId(R.id.newPriceBox)).perform(typeText("100"));
        onView(withId(R.id.setNotificationButton)).perform(click());
        //check user responses!
        onView(withId(R.id.user1)).check(matches(withText("110")));
        onView(withId(R.id.user2)).check(matches(withText("120")));
    }

    @Test
    public void testSendNewBid200(){
        //selecting a task
        onView(withId(R.id.itemSelector)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is(ItemConstants.WALK_A_DOG))).perform(click());
        //adding a new bid
        onView(withId(R.id.newPriceBox)).perform(typeText("200"));
        onView(withId(R.id.setNotificationButton)).perform(click());
        //check user responses!
        onView(withId(R.id.user1)).check(matches(withText("210")));
        onView(withId(R.id.user2)).check(matches(withText("220")));
    }

    @Test
    public void sendNewNotification(){
        //selecting a goods
        onView(withId(R.id.itemSelector)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is(ItemConstants.BABY_TOY))).perform(click());
        //send notification
        onView(withId(R.id.setNotificationButton)).perform(click());
        //check confirmation
        onView(withId(R.id.user3)).check(matches(withText(ItemConstants.BABY_TOY)));
        onView(withId(R.id.user4)).check(matches(withText(ItemConstants.BABY_TOY)));
    }

}
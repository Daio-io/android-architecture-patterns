package io.daio.mvp.screens.next;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import io.daio.mvp.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class NextViewTest {

    @Rule
    public ActivityTestRule<NextActivity> mActivityRule = new ActivityTestRule<>(NextActivity.class);

    @Test
    public void checkUserIsSet() {
        onView(withId(R.id.name_field)).check(matches(withText("Hello there, Billy")));
        onView(withId(R.id.age_field)).check(matches(withText("I see you are 20 years old")));
    }

    @Test
    public void checkGoesBackToHomeActivity() {
        onView(withId(R.id.end_button)).perform(click());

        onView(withId(R.id.get_started_btn)).check(matches(isDisplayed()));
    }

}
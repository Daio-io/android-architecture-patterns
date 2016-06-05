package io.daio.mvp.screens.home;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import io.daio.mvp.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class HomeViewTest {

    @Rule
    public ActivityTestRule<HomeActivity> mActivityRule = new ActivityTestRule<>(HomeActivity.class);

    @Test
    public void checkNavigatesToNextActivity() {
        onView(withId(R.id.get_started_btn)).perform(click());

        // Next activity started - check the field in the next activity/fragment exists
        onView(withId(R.id.name_field)).check(matches(isDisplayed()));
    }

}
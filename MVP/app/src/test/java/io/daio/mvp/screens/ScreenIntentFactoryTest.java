package io.daio.mvp.screens;

import android.content.Intent;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import io.daio.mvp.BuildConfig;
import io.daio.mvp.screens.next.NextActivity;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class ScreenIntentFactoryTest {

    @Test
    public void testNextActivityIntentIsReturnedFromFactory() {
        Intent nextIntent = ScreenIntentFactory.nextActivityIntent(RuntimeEnvironment.application);

        String activityName = nextIntent.getComponent().getClassName();

        assertTrue(activityName.equals(NextActivity.class.getName()));
    }

}
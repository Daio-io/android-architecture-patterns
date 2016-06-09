package io.daio.mvp.screens.home;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import io.daio.mvp.BuildConfig;
import io.daio.mvp.MainActivity;
import io.daio.mvp.R;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.robolectric.shadows.support.v4.SupportFragmentTestUtil.startFragment;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public final class Robo_HomeViewTest {

    @Test
    public void clickingGetStarted_ShouldCallGetStartedOnPresenter() {
        HomeContract.HomePresenter presenter = mock(HomeContract.HomePresenter.class);
        HomeView view = new HomeView();
        view.setPresenter(presenter);

        startFragment(view);

        verify(presenter).start();
    }

    @Test
    public void detaching_ShouldCallDetachOnPresenter() {
        HomeContract.HomePresenter presenter = mock(HomeContract.HomePresenter.class);
        HomeView view = new HomeView();
        view.setPresenter(presenter);

        MainActivity activity = Robolectric.setupActivity(MainActivity.class);

        activity.getSupportFragmentManager().beginTransaction().add(view, null).commit();

        activity.getSupportFragmentManager().beginTransaction().remove(view).commit();

        verify(presenter).detach();
    }

    @Test
    public void starting_ShouldCallStartOnPresenter() {
        HomeContract.HomePresenter presenter = mock(HomeContract.HomePresenter.class);
        HomeView view = new HomeView();
        view.setPresenter(presenter);

        startFragment(view);

        view.getView().findViewById(R.id.get_started_btn).performClick();
        verify(presenter).getStarted();
    }

}

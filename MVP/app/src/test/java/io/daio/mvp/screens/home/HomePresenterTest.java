package io.daio.mvp.screens.home;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import io.daio.mvp.base.NavigationHandler;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(JUnit4.class)
public class HomePresenterTest {

    @Test
    public void testViewSetsPresenter_onConstructor() throws Exception {
        HomeContract.HomeView view = mock(HomeContract.HomeView.class);
        NavigationHandler navigationHandler = mock(NavigationHandler.class);

        HomePresenter presenter = new HomePresenter(navigationHandler, view);

        verify(view).setPresenter(presenter);
    }

    @Test
    public void testGetStarted_shouldCallNavigationHandler() throws Exception {
        HomeContract.HomeView view = mock(HomeContract.HomeView.class);
        NavigationHandler navigationHandler = mock(NavigationHandler.class);

        HomePresenter presenter = new HomePresenter(navigationHandler, view);

        presenter.getStarted();

        verify(navigationHandler).navigate();

    }
}
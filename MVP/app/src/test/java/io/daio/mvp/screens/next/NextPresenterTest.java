package io.daio.mvp.screens.next;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import io.daio.mvp.base.NavigationHandler;
import io.daio.mvp.models.User;
import io.daio.mvp.services.MVPService;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class NextPresenterTest {

    @Test
    public void testStartSetsUserOnView() throws Exception {

        NextContract.View view = mock(NextContract.View.class);
        MVPService<User> service = mock(MVPService.class);
        NavigationHandler handler = mock(NavigationHandler.class);

        User user = new User("", 1);
        when(service.get()).thenReturn(user);

        NextPresenter presenter = new NextPresenter(handler, view, service);

        presenter.start();

        verify(view).setUser(user);

    }

    @Test
    public void testDoneCallsNavigationHandler() throws Exception {

        NextContract.View view = mock(NextContract.View.class);
        MVPService<User> service = mock(MVPService.class);
        NavigationHandler handler = mock(NavigationHandler.class);

        NextPresenter presenter = new NextPresenter(handler, view, service);

        presenter.done();

        verify(handler).navigate();

    }
}
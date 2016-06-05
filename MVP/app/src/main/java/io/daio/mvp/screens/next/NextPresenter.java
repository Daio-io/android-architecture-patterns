package io.daio.mvp.screens.next;


import io.daio.mvp.base.NavigationHandler;
import io.daio.mvp.models.User;
import io.daio.mvp.services.MVPService;

public final class NextPresenter implements NextContract.Presenter {

    private final NavigationHandler handler;
    private final NextContract.View view;
    private MVPService<User> userMVPService;

    public NextPresenter(NavigationHandler handler, NextContract.View view, MVPService<User> userMVPService) {
        this.handler = handler;
        this.view = view;
        this.userMVPService = userMVPService;

        this.view.setPresenter(this);
    }

    @Override
    public void start() {
        view.setUser(userMVPService.getValue());
    }

    @Override
    public void detach() {

    }

    @Override
    public void done() {
        handler.navigateToNext();
    }
}

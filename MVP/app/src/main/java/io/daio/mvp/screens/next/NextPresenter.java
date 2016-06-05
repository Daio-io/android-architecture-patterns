package io.daio.mvp.screens.next;


import io.daio.mvp.base.NavigationHandler;

public final class NextPresenter implements NextContract.Presenter {

    private final NavigationHandler handler;
    private final NextContract.View view;

    public NextPresenter(NavigationHandler handler, NextContract.View view) {
        this.handler = handler;
        this.view = view;
        this.view.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void detach() {

    }

    @Override
    public void done() {
        handler.navigateToNext();
    }
}

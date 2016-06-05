package io.daio.mvp.screens.home;


import io.daio.mvp.base.NavigationHandler;

public final class HomePresenter implements HomeContract.HomePresenter {

    private final NavigationHandler navigationHandler;
    private final HomeContract.HomeView view;

    public HomePresenter(NavigationHandler navigationHandler, HomeContract.HomeView view) {
        this.navigationHandler = navigationHandler;
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
    public void getStarted() {
        navigationHandler.navigateToNext();
    }
}

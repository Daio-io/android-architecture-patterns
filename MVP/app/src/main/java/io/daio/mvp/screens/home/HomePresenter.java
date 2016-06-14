package io.daio.mvp.screens.home;


import io.daio.mvp.base.NavigationHandler;

final class HomePresenter implements HomeContract.HomePresenter {

    private final NavigationHandler navigationHandler;
    private final HomeContract.HomeView view;

    HomePresenter(NavigationHandler navigationHandler, HomeContract.HomeView view) {
        this.navigationHandler = navigationHandler;
        this.view = view;
        this.view.setPresenter(this);
    }

    @Override
    public void start() {
        // At this point you may register listeners
    }

    @Override
    public void detach() {
        // de-register listeners and references
    }

    @Override
    public void getStarted() {
        navigationHandler.navigate();
    }
}

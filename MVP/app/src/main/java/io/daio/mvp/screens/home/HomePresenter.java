package io.daio.mvp.screens.home;


public final class HomePresenter implements HomeContract.HomePresenter {

    private final HomeContract.NavigationHandler navigationHandler;
    private final HomeContract.HomeView view;

    public HomePresenter(HomeContract.NavigationHandler navigationHandler, HomeContract.HomeView view) {
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

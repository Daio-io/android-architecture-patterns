package io.daio.mvp.screens.home;

import io.daio.mvp.base.BasePresenter;
import io.daio.mvp.base.BaseView;

interface HomeContract {

    interface HomePresenter extends BasePresenter {
        void getStarted();
    }

    interface HomeView extends BaseView<HomePresenter> {
    }

}

package io.daio.mvp.screens.next;

import io.daio.mvp.base.BasePresenter;
import io.daio.mvp.base.BaseView;

interface NextContract {

    interface Presenter extends BasePresenter {
        void done();
    }

    interface View extends BaseView<Presenter> {

    }

}

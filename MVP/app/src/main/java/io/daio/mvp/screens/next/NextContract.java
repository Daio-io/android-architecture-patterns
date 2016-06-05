package io.daio.mvp.screens.next;

import io.daio.mvp.base.BasePresenter;
import io.daio.mvp.base.BaseView;
import io.daio.mvp.models.User;

interface NextContract {

    interface Presenter extends BasePresenter {
        void done();
    }

    interface View extends BaseView<Presenter> {
        void setUser(User user);
    }

}

package io.daio.mvp.base;


import android.support.v4.app.Fragment;
import android.util.Log;

public class BaseViewFragment<T extends BasePresenter> extends Fragment implements BaseView<T> {

    protected T presenter;

    @Override
    public void onStart() {
        if (presenter != null) {
            Log.d(presenter.getClass().getSimpleName().toUpperCase(), "STARTED");
            presenter.start();
        }
        super.onStart();
    }

    @Override
    public void onDetach() {
        if (presenter != null) {
            Log.d(presenter.getClass().getSimpleName().toUpperCase(), "DETACHED");
            presenter.detach();
        }
        super.onDetach();
    }

    @Override
    public void setPresenter(T presenter) {
        this.presenter = presenter;
    }
}

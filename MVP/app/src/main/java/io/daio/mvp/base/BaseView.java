package io.daio.mvp.base;


public interface BaseView<T extends BasePresenter> {
    void setPresenter(T presenter);
}

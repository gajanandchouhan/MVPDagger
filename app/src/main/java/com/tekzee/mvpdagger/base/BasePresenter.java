package com.tekzee.mvpdagger.base;

public interface BasePresenter<V> {

    void dropView();

    void takeView(V view);

}

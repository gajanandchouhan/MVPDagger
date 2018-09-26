package com.tekzee.mvpdagger.ui.main;

import android.util.Log;

import com.tekzee.mvpdagger.data.api.ApiClient;
import com.tekzee.mvpdagger.data.api.ApiInterface;
import com.tekzee.mvpdagger.data.model.BaseReponse;

import java.util.ArrayList;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

public class MainPresenter implements MainContract.Presenter {
    MainContract.View view;
    CompositeDisposable compositeDisposable;


    @Inject
    public MainPresenter() {
        compositeDisposable = new CompositeDisposable();
    }

    @Override
    public void getMainListData() {
        Log.v("CALLED", ",mainList Data");
        ApiInterface apiClient = ApiClient.getClient().create(ApiInterface.class);
        Observable<BaseReponse> response = apiClient.getResponse();
        DisposableObserver<BaseReponse> disposableObserver = response.observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io()).subscribeWith(new DisposableObserver<BaseReponse>() {
            @Override
            public void onNext(BaseReponse o) {
                view.setMainListData(new ArrayList());
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
        compositeDisposable.add(disposableObserver);

    }

    @Override
    public void dropView() {
        this.view = null;
        compositeDisposable.clear();
    }

    @Override
    public void takeView(MainContract.View view) {
        this.view = view;
    }


}

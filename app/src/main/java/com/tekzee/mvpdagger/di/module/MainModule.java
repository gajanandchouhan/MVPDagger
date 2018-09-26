package com.tekzee.mvpdagger.di.module;

import com.tekzee.mvpdagger.di.ActivityScope;
import com.tekzee.mvpdagger.ui.main.MainContract;
import com.tekzee.mvpdagger.ui.main.MainPresenter;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

@Module
public class MainModule {

    @Provides
    @ActivityScope
    MainContract.Presenter prevoidMainPrensenter() {
        return new MainPresenter();
    }

}

package com.tekzee.mvpdagger.di.component;

import com.tekzee.mvpdagger.MVPDagger;
import com.tekzee.mvpdagger.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(MVPDagger mvpDagger);
}

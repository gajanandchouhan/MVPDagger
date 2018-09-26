package com.tekzee.mvpdagger.di.module;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    Context getAppicationContext() {
        return application;
    }

    @Provides
    Application getApplication() {
        return application;
    }


}

package com.tekzee.mvpdagger;

import android.app.Application;
import android.content.Context;

import com.tekzee.mvpdagger.di.component.ApplicationComponent;
import com.tekzee.mvpdagger.di.component.DaggerApplicationComponent;
import com.tekzee.mvpdagger.di.module.ApplicationModule;

public class MVPDagger extends Application {

    private ApplicationComponent aaplicationComponent;

    public static MVPDagger get(Context context) {
        return (MVPDagger) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        aaplicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
        aaplicationComponent.inject(this);
    }

    public ApplicationComponent getAaplicationComponent() {
        return aaplicationComponent;
    }
}

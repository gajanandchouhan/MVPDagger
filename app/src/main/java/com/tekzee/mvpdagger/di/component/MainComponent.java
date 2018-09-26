package com.tekzee.mvpdagger.di.component;

import com.tekzee.mvpdagger.di.ActivityScope;
import com.tekzee.mvpdagger.di.module.MainModule;
import com.tekzee.mvpdagger.ui.main.MainActivity;

import dagger.Component;

@ActivityScope
@Component(dependencies = ApplicationComponent.class,modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}

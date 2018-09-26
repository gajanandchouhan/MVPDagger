package com.tekzee.mvpdagger.ui.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.tekzee.mvpdagger.MVPDagger;
import com.tekzee.mvpdagger.R;
import com.tekzee.mvpdagger.base.BaseActivity;
import com.tekzee.mvpdagger.di.component.ApplicationComponent;
import com.tekzee.mvpdagger.di.component.DaggerMainComponent;
import com.tekzee.mvpdagger.di.module.MainModule;

import java.util.List;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainContract.View {
    @Inject
    MainContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainComponent.builder().applicationComponent(MVPDagger.get(this).getAaplicationComponent()).mainModule(new MainModule()).build().inject(this);
        presenter.takeView(this);
        presenter.getMainListData();
    }


    @Override
    public void setMainListData(List listData) {
        Log.v("CALLED", "MainData");
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.dropView();
    }
}

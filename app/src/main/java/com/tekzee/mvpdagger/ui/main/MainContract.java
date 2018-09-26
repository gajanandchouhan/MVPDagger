package com.tekzee.mvpdagger.ui.main;

import com.tekzee.mvpdagger.base.BasePresenter;
import com.tekzee.mvpdagger.base.BaseView;

import java.util.List;

public interface MainContract {
    interface View extends BaseView<Presenter> {
        void setMainListData(List listData);
    }

    interface Presenter extends BasePresenter<View> {
        void getMainListData();
    }
}

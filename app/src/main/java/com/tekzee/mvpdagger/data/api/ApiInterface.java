package com.tekzee.mvpdagger.data.api;


import com.tekzee.mvpdagger.data.model.BaseReponse;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by JAIN COMPUTERS on 11/18/2017.
 */

public interface ApiInterface {
    @GET("getResponse")
    Observable<BaseReponse> getResponse();
}
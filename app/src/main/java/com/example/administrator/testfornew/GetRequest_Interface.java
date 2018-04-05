package com.example.administrator.testfornew;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Administrator on 2018/4/5.
 */

public interface GetRequest_Interface {
    @GET("ajax.php?a=fy&f=auto&t=auto&w=hello%20world")
    Call<Translate> getCall();
}

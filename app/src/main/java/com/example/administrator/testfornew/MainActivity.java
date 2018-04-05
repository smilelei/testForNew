package com.example.administrator.testfornew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRequest();
    }
    public void initRequest(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://fy.iciba.com/")
                                .addConverterFactory(GsonConverterFactory.create())
                                .build();
         GetRequest_Interface getRequest_interface = retrofit.create(GetRequest_Interface.class);
        Call<Translate> call = getRequest_interface.getCall();
        call.enqueue(new Callback<Translate>() {
            @Override
            public void onResponse(Call<Translate> call, Response<Translate> response) {
                response.body().Show();
            }

            @Override
            public void onFailure(Call<Translate> call, Throwable t) {

            }
        });
    }

}

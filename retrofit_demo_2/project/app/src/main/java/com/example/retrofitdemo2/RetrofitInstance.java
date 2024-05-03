package com.example.retrofitdemo2;

import static com.example.retrofitdemo2.MainActivity.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    public static RetrofitInstance instance;
    APIInterface apInterface;
    RetrofitInstance() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(api)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apInterface = retrofit.create(APIInterface.class);
    }

    public static RetrofitInstance getInstance(){
        if(instance==null){
            instance = new RetrofitInstance();
        }
        return instance;
    }
}

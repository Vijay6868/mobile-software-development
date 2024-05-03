package com.example.retrofitdemo2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    public static String api= "https://opentdb.com/";
    //https://opentdb.com/api.php?amount=10&category=9&difficulty=medium&type=multiple
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(api)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        retrofit.create(APIInterface.class);*/
        RetrofitInstance.getInstance().apInterface.getQuestions()
                .enqueue(new Callback<List<QuestionModel>>() {
                    @Override
                    public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                        Log.e("api","onFailure"+response.body().toString());
                    }

                    @Override
                    public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                        Log.e("api","onFailure"+t.getLocalizedMessage());
                    }
                });
    }
}
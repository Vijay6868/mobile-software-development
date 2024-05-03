package com.example.retrofitdemo2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("api.php?amount=10&category=9&difficulty=medium&type=multiple")
    Call<List<QuestionModel>> getQuestions();
}

package com.example.myapplication;

import android.util.Log;

import androidx.annotation.NonNull;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserControllerRESTAPI implements retrofit2.Callback<Users>{
    final  String BASE_URL = "https://reqres.in/api/";
    private Users users;
    public void start(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        UserRESTAPI userRESTAPI = retrofit.create(UserRESTAPI.class);
        Call<Users> call = userRESTAPI.getUsers();
        call.enqueue(this);
    }
    public void onResponse(@NonNull Call<Users> call, Response<Users> response) {
        if (response.isSuccessful()) {
            users = response.body();
            assert users != null;
            Log.d("USER_Count", "User Count: " + users.userList.size());
            List<User> userList = users.getUserList();
            if (userList != null && users.getUserList() != null) {
                List<User> usersList = users.getUserList();
                for (User u : usersList) {
                    Log.d("USER_INFO", "User: " + u.toString());
                }

            } else {
                Log.d("USER_INFO", "User's List is null or empty");
            }
        } else {
            Log.d("USER_INFO", "Failed to get users. Response code: " + response.code());
        }
    }

    @Override
    public void onFailure(@NonNull Call<Users> call, @NonNull Throwable t) {
        Log.d("USER_INFO", "Error getting users", t);
    }

    public Users getUsers() {
        if( users !=null)
            Log.d("USER_Count"," User Count--"+ users.userList.size());
        else
            Log.d("USER_Count"," Users object is null");

        return users;

    }
}

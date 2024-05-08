package com.example.volleydemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;



public class MainActivity extends AppCompatActivity {
    UserModelControllerAPI userModelControllerAPI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userModelControllerAPI = new UserModelControllerAPI(this);
        userModelControllerAPI.getData();

    }

}
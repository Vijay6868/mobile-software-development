package com.example.volleydemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONException;


public class MainActivity extends AppCompatActivity implements DataCallback{
    UserModelControllerAPI userModelControllerAPI;
    TextView hw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hw = findViewById(R.id.hw);
       userModelControllerAPI = new UserModelControllerAPI(this,this);
       userModelControllerAPI.getData();
        }

    @Override
    public void onDataLoaded(UserModelList list) {
        String category = null;
        try {
            category = list.getUserModelList().get(0).getIncorrect_answers().get(0).toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        Log.d("Data Loaded", "Size: " + category);
        hw.setText(category);
    }
}



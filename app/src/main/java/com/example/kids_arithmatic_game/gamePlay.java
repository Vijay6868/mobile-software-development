package com.example.kids_arithmatic_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class gamePlay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_play);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.MSG);

        TextView tv_name = findViewById(R.id.lbPlayerName);
        tv_name.setText(name);


    }
}
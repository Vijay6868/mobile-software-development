package com.example.kids_arithmatic_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Random;
public class gamePlay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_play);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.MSG);
        String operator = intent.getStringExtra(MainActivity.OP);
        String age = intent.getStringExtra(MainActivity.AGE);
        int pAge = Integer.parseInt(age);
        TextView tv_name = findViewById(R.id.lbPlayerName);
        TextView tv_operator = findViewById(R.id.tvOp);

        tv_name.setText(name);
        tv_operator.setText(operator);


        gameStart(pAge,operator);
    }
    //determining number limit according to the age.
    public int deterNumLim(int age){
        int retValue =0;
        if(age==2){
            retValue = 9;
        }
        else if(age==3){
            retValue = 50;
        }
        else if(age >=4 && age <=5){
            retValue =100;
        }
        else{
            retValue =1000;
        }
        return retValue;
    }
    //generating random number depending on the age
    public int genRandomNum(int limit){
        Random rand = new Random();
        int num = rand.nextInt(limit);
        return num;
    }
    public void gameStart(int age, String op){

        for(int i=0; i<6;i++){
            int val1 = genRandomNum(deterNumLim(age));
            int val2 = genRandomNum(deterNumLim(age));
            TextView value1 = findViewById(R.id.tbValue1);
            TextView value2 = findViewById(R.id.tbValue2);
            value1.setText(String.valueOf(val1));
            value2.setText(String.valueOf(val2));
        }

    }
}
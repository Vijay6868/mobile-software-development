package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBtnPlus(View view){
        TextView txtOp = findViewById(R.id.lbOperator);
        txtOp.setText("+");

        TextView num1 = findViewById(R.id.tbNum1);
        TextView num2 = findViewById(R.id.tbNum2);
        TextView result = findViewById(R.id.tbResult);


        int value1 = Integer.parseInt(num1.getText().toString());
        int value2 = Integer.parseInt(num2.getText().toString());

        int value3 = value1+value2;

        result.setText(String.valueOf(value3));


    }
    public void onBtnMinus(View view) {
        TextView txtOp = findViewById(R.id.lbOperator);
        txtOp.setText("-");


        TextView num1 = findViewById(R.id.tbNum1);
        TextView num2 = findViewById(R.id.tbNum2);
        TextView result = findViewById(R.id.tbResult);


        int value1 = Integer.parseInt(num1.getText().toString());
        int value2 = Integer.parseInt(num2.getText().toString());

        int value3 = value1-value2;

        result.setText(String.valueOf(value3));
    }
    public void onBtnMulti(View view) {
        TextView txtOp = findViewById(R.id.lbOperator);
        txtOp.setText("x");


        TextView num1 = findViewById(R.id.tbNum1);
        TextView num2 = findViewById(R.id.tbNum2);
        TextView result = findViewById(R.id.tbResult);


        int value1 = Integer.parseInt(num1.getText().toString());
        int value2 = Integer.parseInt(num2.getText().toString());

        int value3 = value1*value2;

        result.setText(String.valueOf(value3));
    }
}
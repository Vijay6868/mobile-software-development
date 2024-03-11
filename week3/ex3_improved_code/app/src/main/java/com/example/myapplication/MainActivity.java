package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    View OP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View btnPlus = findViewById(R.id.plusButton);
        View btnMinus = findViewById(R.id.minusButton);
        View btnMulti = findViewById(R.id.multiButton);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMulti.setOnClickListener(this);

        //this.OP = findViewById(R.id.lbOperator);
        //txtOp.setText(operator);
    }
    public void performOperation(String operator) {
        TextView txtOp = findViewById(R.id.lbOperator);
        txtOp.setText(operator);

        TextView num1 = findViewById(R.id.tbNum1);
        TextView num2 = findViewById(R.id.tbNum2);
        TextView result = findViewById(R.id.tbResult);



        int value1 = Integer.parseInt(num1.getText().toString());
        int value2 = Integer.parseInt(num2.getText().toString());

        int value3;
        switch (operator) {
            case "+":
                value3 = value1 + value2;
                break;
            case "-":
                value3 = value1 - value2;
                break;
            case "x":
                value3 = value1 * value2;
                break;
            default:

                return;
        }

        result.setText(String.valueOf(value3));

    }

    public void onBtnPlus(View view) {
        performOperation("+");
    }

    public void onBtnMinus(View view) {
        performOperation("-");
    }

    public void onBtnMulti(View view) {
        performOperation("x");
    }

    @Override
    public void onClick(View v) {

        TextView num1 = findViewById(R.id.tbNum1);
        TextView num2 = findViewById(R.id.tbNum2);
        TextView result = findViewById(R.id.tbResult);

        int value1 = Integer.parseInt(num1.getText().toString());
        int value2 = Integer.parseInt(num2.getText().toString());

        }
    }
}
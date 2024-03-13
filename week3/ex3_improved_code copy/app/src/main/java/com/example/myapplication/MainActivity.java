package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvOp, tvResult;
    EditText txtN1, txtN2;
    Button btnPlus, btnMinus, btnMulti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlus = findViewById(R.id.plusButton);
        btnMinus = findViewById(R.id.minusButton);
        btnMulti = findViewById(R.id.multiButton);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMulti.setOnClickListener(this);

        txtN1 = findViewById(R.id.tbNum1);
        txtN2 = findViewById(R.id.tbNum2);
        tvOp = findViewById(R.id.lbOperator);
        tvResult = findViewById(R.id.tbResult);

    }




    @Override
    public void onClick(View v) {


        //TextView result = findViewById(R.id.tbResult);

        int value1 = Integer.parseInt(txtN1.getText().toString());
        int value2 = Integer.parseInt(txtN2.getText().toString());
        int result =0;
        if(v==btnPlus){
            result= value1+value2;
            tvOp.setText("+");
        }
        else if(v==btnMinus){
            result = value2 - value1;
            tvOp.setText("-");
        } else if (v==btnMulti) {
            result = value1 * value2;
            tvOp.setText("x");
        }
        tvResult.setText(String.valueOf(result));
    }
}
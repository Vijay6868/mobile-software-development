package com.example.kids_arithmatic_game;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class gamePlay extends AppCompatActivity {
    int Ans,age;
    int correctAnswers = 0; // Variable to keep track of correct answers
    int questionCount = 0; // Variable to keep track of the number of questions asked

    String operator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_play);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.MSG);
        operator = intent.getStringExtra(MainActivity.OP);
        String pAge = intent.getStringExtra(MainActivity.AGE);
        age = Integer.parseInt(pAge);
        TextView tv_name = findViewById(R.id.lbPlayerName);
        TextView tv_operator = findViewById(R.id.lbOp);

        tv_name.setText(name);
        tv_operator.setText(operator);

        gameStart();
        check(); // Call the method to set up onClick listener for the "Check" button
    }

    // determining number limit according to the age.
    public int deterNumLim() {
        int retValue = 0;
        if (age == 2) {
            retValue = 9;
        } else if (age == 3) {
            retValue = 50;
        } else if (age >= 4 && age <= 5) {
            retValue = 100;
        } else {
            retValue = 1000;
        }
        return retValue;
    }

    // generating random number depending on the age
    public int genRandomNum(int limit) {
        Random rand = new Random();
        return rand.nextInt(limit);
    }

    public void gameStart() {
        for (int i = 0; i < 5; i++) { // Loop until 5 questions are asked
            int val1 = genRandomNum(deterNumLim());
            int val2 = genRandomNum(deterNumLim());

            TextView value1 = findViewById(R.id.lbValue1);
            TextView value2 = findViewById(R.id.lbValue2);

            value1.setText(String.valueOf(val1));
            value2.setText(String.valueOf(val2));

            if (operator.equals("+")) {
                Ans = val1 + val2;
            } else if (operator.equals("-")) {
                Ans = val1 - val2;
            } else if (operator.equals("x")) {
                Ans = val1 * val2;
            }
        }
    }

    public void check() {
        Button checkBt = findViewById(R.id.btCheck);
        checkBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView usInput = findViewById(R.id.tbInput);
                String input = usInput.getText().toString();
                int usAns = Integer.parseInt(input);
                if (usAns == Ans) {
                    Toast.makeText(gamePlay.this, "Correct !", Toast.LENGTH_SHORT).show();
                    correctAnswers++; // Increment correct answers count
                } else {
                    Toast.makeText(gamePlay.this, "Incorrect !", Toast.LENGTH_SHORT).show();
                }
                questionCount++; // Increment question count
                if (questionCount < 5) { // Ask next question if not reached the limit
                    gameStart(); // Call gameStart() to ask next question
                } else {
                    // Display total correct answers
                    Toast.makeText(gamePlay.this, "Total Correct Answers: " + correctAnswers, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}


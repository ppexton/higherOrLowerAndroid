package com.phill.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void checkGuess(View view) {

        EditText guessValue = (EditText) findViewById(R.id.guessValue);

        String guessValueString = guessValue.getText().toString();
        int guessValueInt = Integer.parseInt(guessValueString);

        String message = "";

        if (randomNumber == guessValueInt) {
            message = "Correct!";
        } else if (randomNumber > guessValueInt) {
            message = "Too low!";
        } else {
            message = "Too high!";
        }

        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(20) + 1;

    }
}

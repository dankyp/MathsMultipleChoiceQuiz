package com.example.android.mathsmultiplechoicequiz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        TextView scoreLabel = (TextView) findViewById(R.id.scoreLabel);

        int score = getIntent().getIntExtra("Score: ", 0);
        scoreLabel.setText(String.valueOf(score));

    }

    public void tryAgain(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}

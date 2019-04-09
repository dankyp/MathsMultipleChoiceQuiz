package com.example.android.mathsmultiplechoicequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonQuit;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    mScoreView = (TextView) findViewById(R.id.score);
    mQuestionView = (TextView) findViewById(R.id.question);
    mButtonChoice1 = (Button)findViewById(R.id.choice1);
    mButtonChoice2 = (Button)findViewById(R.id.choice2);
    mButtonChoice3 = (Button)findViewById(R.id.choice3);
    mButtonQuit = (Button)findViewById(R.id.quit);

    updateQuestion();

    //Start of button listener

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //logic for button
                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                updateScore(mScore);
                updateQuestion();
                Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
            }else{
                    Toast.makeText(MainActivity.this, "Incorrect!", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        //End of button listener

        //Start of button listener

        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //logic for button
                if (mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Incorrect!", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        //End of button listener

        //Start of button listener

        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //logic for button
                if (mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Incorrect!", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        //End of button listener
    }

    private void updateScore(int point){
        mScoreView.setText("" + mScore);
    }

    private void updateQuestion() {
        if (mQuestionNumber < mQuestionLibrary.getLength()){
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));

        mAnswer = mQuestionLibrary.getAnswer(mQuestionNumber);
        mQuestionNumber++;
    } else     {
        Toast.makeText(MainActivity.this,"Game Over! Your Score is " + mScore,Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(getApplicationContext(),Results.class);
            intent.putExtra ("Score: " ,+ mScore + " /5");
            startActivityForResult(intent,mScore,null);}

        //show result

}

public void setmButtonQuit(View view){
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
}

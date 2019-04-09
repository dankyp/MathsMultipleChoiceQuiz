package com.example.android.mathsmultiplechoicequiz;

public class QuestionLibrary {

    private String mQuestions[] = {
                "What is 10 x 5?",
                "Which is the first prime number?",
                "What is 12 squared?",
                "What is 30 / 5?",
                "What is 360 - 36?"
    };

    private String mChoices [] [] = {
            {"55", "50", "15"},
            {"1", "2", "3"},
            {"120", "144", "24"},
            {"5", "15", "6",},
            {"324", "314", "334"}
    };

    private String mAnswers [] = {"50", "2", "144", "6", "324"};

    public String getQuestion(int a){
     String question = mQuestions [a];
     return question;
    }

    public String getChoice1 (int a){
        String choice0 = mChoices [a][0];
                return choice0;
    }

    public String getChoice2 (int a){
        String choice1 = mChoices [a][1];
        return choice1;
    }

    public String getChoice3 (int a){
        String choice2 = mChoices [a][2];
        return choice2;
    }

    public  String getAnswer (int a){
        String answer = mAnswers[a];
        return answer;
    }

    public int getLength (){
        return mQuestions.length;
    }
}

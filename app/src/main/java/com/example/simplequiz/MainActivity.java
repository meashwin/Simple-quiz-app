package com.example.simplequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {


    String[] questions = new String[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openAnswers(View view)
    {
        Intent questionint=new Intent(this,Questions.class);
        startActivity(questionint);
    }

    public void openQuestion(View view)
    {
        Intent answerint=new Intent(this,AnswerSection.class);
        startActivity(answerint);
    }
}
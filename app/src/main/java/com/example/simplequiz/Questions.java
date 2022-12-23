package com.example.simplequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Questions<Indent> extends AppCompatActivity {

    EditText question;
    int index=0;
    boolean[] answers=new boolean[5];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
    }


    public void yesques(View view)
    {
        MainActivity m=new MainActivity();
        if(index<=5)
        {
            question=findViewById(R.id.quesquestions);
            String a=question.getText().toString();
            m.questions[index]=a;
            answers[index]=true;
            index++;
            question.setText("");

        }
        if(index==5)
        {
            Toast.makeText(this, "Maximum questions reached go back to homepage and start the quiz", Toast.LENGTH_SHORT).show();
            index=5;

        }
    }

    public void noques(View view)
    {
        MainActivity m=new MainActivity();
        if(index<=5)
        {
            question=findViewById(R.id.quesquestions);
            String a=question.getText().toString();
            m.questions[index]=a;
            answers[index]=false;
            index++;
            question.setText("");
        }
        if(index==5)
        {
            Toast.makeText(this, "Maximum questions reached go back to homepage and start the quiz", Toast.LENGTH_SHORT).show();
            index=5;

        }
    }
}
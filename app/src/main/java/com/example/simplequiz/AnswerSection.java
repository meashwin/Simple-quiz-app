package com.example.simplequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AnswerSection extends AppCompatActivity {

    int count=0;
    int score=0;
    TextView text;
    Questions q=new Questions();
    MainActivity m=new MainActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_section);
        text=findViewById(R.id.dispques);
        text.setText(count);

    }

    public void ansyes(View view)
    {
        if(count<=5)
        {
            if(q.answers[count])
            {
                text=findViewById(R.id.dispques);
                text.setText(m.questions[count]);
                score++;
                count++;
            }
            else
            {
                text=findViewById(R.id.dispques);
                text.setText(m.questions[count]);
                count++;
            }

        }
        else
        {
            Toast.makeText(this, score+"/"+count, Toast.LENGTH_SHORT).show();
        }
    }

    public void ansno(View view)
    {
        if(count<=5)
        {
            if(!q.answers[count])
            {
                text=findViewById(R.id.dispques);
                text.setText(m.questions[count]);
                score++;
                count++;
            }
            else
            {
                text=findViewById(R.id.dispques);
                text.setText(m.questions[count]);
                count++;
            }

        }
        else
        {
            Toast.makeText(this, score+"/"+count, Toast.LENGTH_SHORT).show();
        }
    }
}
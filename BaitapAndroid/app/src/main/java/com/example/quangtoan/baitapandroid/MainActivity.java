package com.example.quangtoan.baitapandroid;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private QuestionLibrary[] questions;
private  static int ques;
TextView txt;
Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChechAnswer(true);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChechAnswer(false);


            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ques-=1;
                if (ques<0){
                    ques=0;
                }
                ShowQuestion(ques);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ques+=1;
                if (ques>questions.length-1){
                    ques=0;
                }
                ShowQuestion(ques);

            }
        });
        Resources resources=getResources();
        questions =new QuestionLibrary[]{
                new QuestionLibrary(resources.getString(R.string.q_0),resources.getBoolean(R.bool.a_0)),
                new QuestionLibrary(resources.getString(R.string.q_1),resources.getBoolean(R.bool.a_1)),
                new QuestionLibrary(resources.getString(R.string.q_2),resources.getBoolean(R.bool.a_2)),
                new QuestionLibrary(resources.getString(R.string.q_3),resources.getBoolean(R.bool.a_3))
        };
        if (questions.length>0){
            ques=0;
        }
        else {
            ques=-1;
        }
        ShowQuestion(ques);

    }
    private void ShowQuestion(int index){
        txt.setText(questions[index].getContent());
    }

    private void ChechAnswer(boolean answer){
        if (answer==questions[ques].isTrue())
        {
            Toast.makeText(this, "Correct", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Incorrect", Toast.LENGTH_LONG).show();
        }
    }

    private void anhxa() {
        txt=findViewById(R.id.txtcauhoi);
        btn1=findViewById(R.id.btndung);
        btn2=findViewById(R.id.btnsai);
        btn3=findViewById(R.id.btnprev);
        btn4=findViewById(R.id.btnnext);
    }


}

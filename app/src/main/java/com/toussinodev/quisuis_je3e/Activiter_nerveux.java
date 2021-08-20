package com.toussinodev.quisuis_je3e;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.toussinodev.quisuis_je3e.model_questionnaire.Model_nerveux;

import java.util.Random;

public class Activiter_nerveux extends AppCompatActivity implements View.OnClickListener {

    Button button1,button2,button3,button4;
    private Model_nerveux question = new Model_nerveux();
    TextView question_text,Score;
    private String reponse;
    private int questionLenght = question.myQuestion.length;
    Random random;
    ProgressBar progress;
    private TextView noQuestion;
    int currentPosition = 0;
    int numberOfCorrectAnswer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activiter_nerveux);


        Score = findViewById(R.id.Score);
        progress = findViewById(R.id.progress);
        noQuestion = findViewById(R.id.noQuestion);
        setData();

        random = new Random();

        button1= findViewById(R.id.button1);
        button1.setOnClickListener(this);


        button2= findViewById(R.id.button2);
        button2.setOnClickListener(this);

        button3= findViewById(R.id.button3);
        button3.setOnClickListener(this);

        button4= findViewById(R.id.button4);
        button4.setOnClickListener(this);
        question_text = findViewById(R.id.question);
        NextQuestion(random.nextInt(questionLenght));




    }


    private void NextQuestion(int num) {
        question_text.setText(question.getQuestion(num));
        button1.setText(question.getChoice1(num));
        button2.setText(question.getChoice2(num));
        button3.setText(question.getChoice3(num));
        button4.setText(question.getChoice4(num));
        reponse = question.getCorrectReponse(num);


    }



    public void onClick(View view){
        Button answerBtn = findViewById(view.getId());
        String btnText = answerBtn.getText().toString();
        String alertTitle;
        if (btnText.equals(reponse)){

            //bonne reponse
            alertTitle = "Bonne reponse !";
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(alertTitle);
            builder.setCancelable(false);
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    currentPosition++;
                    numberOfCorrectAnswer++;
                    NextQuestion(random.nextInt(questionLenght));
                    setData();
                }
            });
            builder.show();


        }else{
            //mauvaise reponse
            alertTitle = "Mauvaise réponse !";
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(alertTitle);
            builder.setMessage("la réponse est : " + reponse);
            builder.setCancelable(false);
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    currentPosition++;
                    NextQuestion(random.nextInt(questionLenght));
                    setData();
                }
            });
            builder.show();


        }


        int x = ((currentPosition+1) * 100) / question.myQuestion.length;
        progress.setProgress(x);




    }

    public void setData(){

        if (question.myQuestion.length > currentPosition){

            Score.setText("Score : " + numberOfCorrectAnswer + "/" + question.myQuestion.length);
            noQuestion.setText("Question no : " + (currentPosition + 1));



        }else{
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Félicitation, vous avez terminer le Quiz");
            builder.setMessage("Votre Score est : " + numberOfCorrectAnswer + "/" + question.myQuestion.length);
            builder.setCancelable(false);
            builder.setPositiveButton("Recommencer", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    currentPosition = 0;
                    numberOfCorrectAnswer = 0;
                    progress.setProgress(0);
                    setData();
                }
            }).setNegativeButton("Fermez", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            builder.show();



        }


    }





}

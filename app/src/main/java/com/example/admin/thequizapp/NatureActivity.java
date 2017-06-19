package com.example.admin.thequizapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class NatureActivity extends AppCompatActivity {

    private TextView txtQuestions,txtScore ;
    private Button btnAnswer1,btnAnswr2,btnAnswr3,btnAnswr4,btnQuitGame;

    private Questions askQuestions = new Questions();
    private String answer;
    private int theScore = 0;
    private int theQuestionsLength =  askQuestions.theQustions.length;

    Random theRand = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nature);
        gameOver();
        txtQuestions = (TextView) findViewById(R.id.txtQuestion);

        btnAnswer1 = (Button) findViewById(R.id.btnAnswr1);
        btnAnswr2 = (Button) findViewById(R.id.btnAnswr2);
        btnAnswr3 = (Button) findViewById(R.id.btnAnswer3);
        btnAnswr4 = (Button) findViewById(R.id.btnAnswer4);



        txtScore = (TextView) findViewById(R.id.txtScore);
        txtQuestions = (TextView) findViewById(R.id.txtQuestion);

        txtScore.setText("Score:" + theScore);
        updtaeQuestions(theRand.nextInt(theQuestionsLength));

        btnAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnAnswer1.getText() == answer)
                {
                    theScore++;
                    txtScore.setText("Score :" + theScore);
                    updtaeQuestions(theRand.nextInt(theQuestionsLength));
//                    Toast.makeText(NatureActivity.this, "Correct Anwswer",Toast.LENGTH_SHORT).show();
                }
                else if(btnAnswer1.getText() != answer)
                {
//                    Toast.makeText(NatureActivity.this, "Wrong Anwswer",Toast.LENGTH_SHORT).show();
                    updtaeQuestions(theRand.nextInt(theQuestionsLength));
                }
                else {

                    gameOver();
                }
            }
        });

// Button Two

        btnAnswr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnAnswr2.getText() == answer)
                {
                    theScore++;
                    txtScore.setText("Score :" + theScore);
                    updtaeQuestions(theRand.nextInt(theQuestionsLength));
//                    Toast.makeText(NatureActivity.this, "Correct Anwswer",Toast.LENGTH_SHORT).show();
                    updtaeQuestions(theRand.nextInt(theQuestionsLength));
                }
                else if(btnAnswr2.getText() != answer)
                {
//                    Toast.makeText(NatureActivity.this, "Wrong Anwswer",Toast.LENGTH_SHORT).show();
                    updtaeQuestions(theRand.nextInt(theQuestionsLength));
                }
                else {

                    gameOver();
                }
            }
        });

        btnAnswr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnAnswr3.getText() == answer)
                {
                    theScore++;
                    txtScore.setText("Score :" + theScore);
                    updtaeQuestions(theRand.nextInt(theQuestionsLength));
//                    Toast.makeText(NatureActivity.this, "Correct Anwswer",Toast.LENGTH_SHORT).show();
                    updtaeQuestions(theRand.nextInt(theQuestionsLength));
                }
                else if(btnAnswr3.getText() != answer)
                {
                    updtaeQuestions(theRand.nextInt(theQuestionsLength));

                }
                else {

                    gameOver();
                }
            }
        });

        btnAnswr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnAnswr4.getText() == answer)
                {
                    theScore++;
                    txtScore.setText("Score :" + theScore);
                    updtaeQuestions(theRand.nextInt(theQuestionsLength));
//                    Toast.makeText(NatureActivity.this, "Correct Anwswer",Toast.LENGTH_SHORT).show();
                }
                else if(btnAnswr4.getText() != answer)
                {
//                    Toast.makeText(NatureActivity.this, "Wrong Anwswer",Toast.LENGTH_SHORT).show();
                      updtaeQuestions(theRand.nextInt(theQuestionsLength));
                }
                else {

                    gameOver();
                }
            }
        });

    }
    private void updtaeQuestions(int num)
    {
        txtQuestions.setText(askQuestions.getQuestions(num));
        btnAnswer1.setText(askQuestions.getChoices1(num));
        btnAnswr2.setText(askQuestions.getChoices2(num));
        btnAnswr3.setText(askQuestions.getChoices3(num));
        btnAnswr4.setText(askQuestions.getChoices4(num));

        answer = askQuestions.getCorrectAnswers(num);
    }

    //        Button Quit Game

    public void gameOver()
    {
        btnQuitGame = (Button) findViewById(R.id.btnQuitGame);

        btnQuitGame.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                AlertDialog.Builder arletDialogBuiler = new AlertDialog.Builder(NatureActivity.this);
                arletDialogBuiler.setMessage("Game Over! and Your Score is " + theScore + " points ")
                        .setCancelable(false)
                        .setPositiveButton("NEW GAME",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                                        finish();
                                    }
                                })
                        .setNegativeButton("QUIT GAME",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        finish();
                                    }
                                });
                AlertDialog alertDialog = arletDialogBuiler.create();
                alertDialog.show();

            }
        });

    }
}

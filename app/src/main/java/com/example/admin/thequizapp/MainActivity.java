package com.example.admin.thequizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView txtScore, txtQustion;

    private ImageButton imgMusic, imgPolitics, imgSport, imgNature;

    private String answer;
    private int theScore = 0;
   // private int theQuestionsLength = askQuestions.theQustions.length;

    Random theRand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgNature = (ImageButton) findViewById(R.id.imgNature);
        imgMusic = (ImageButton) findViewById(R.id.imgMusic);
        imgPolitics = (ImageButton) findViewById(R.id.imgPolitics);
        imgSport = (ImageButton) findViewById(R.id.imgSport);

        imgNature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logIn = new Intent(MainActivity.this, NatureActivity.class);
                startActivity(logIn);

            }
        });

        imgMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logIn = new Intent(MainActivity.this, MusicActivity.class);
                startActivity(logIn);

            }
        });
        imgPolitics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logIn = new Intent(MainActivity.this, PoliticsActivity.class);
                startActivity(logIn);

            }
        });
        imgSport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logIn = new Intent(MainActivity.this, SportActivity.class);
                startActivity(logIn);

            }
        });
    }

}

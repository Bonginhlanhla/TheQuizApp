package com.example.admin.thequizapp;

/**
 * Created by Admin on 6/6/2017.
 */

public class SportQuestions {

    public String theQustions [] = {

            "Which sport is played on the largest pitch?",
            "What is the National sport in Japan?",
            "How many minutes in a ruby match?",
            "In which country were the first Olympic Games held?",
            "What is the largest stadium in the Wolrd?",
            "How many matches did Mohammed Ali loose in his career?",
            "Which country was the first to host wolrd Cup in Africa?"

    };

    public String theChoices [] [] = {

            {"Polo","Soccer","Ruby","Cricket"},
            {"Sumo Wrestling","Asamo Wrestling","Acqua Sport","husann Sport"},
            {"90minutes","60minutes","80minutes","75minutes"},
            {"Brazil","England","Greece","Germany"},
            {"Emarates Staium","Soccer City","Azteca Stadium in Mexico","Anelfied Stadium"},
            {"Two","One","Three","None"},
            {"Ghana","Nigeria","South Africa","Algeria"}

    };

    private String theCorrectAnswers [] = {"Polo","Sumo Wrestling","80minutes","Greece","Azteca Stadium in Mexico","One","South Africa"};

    public String getQuestions(int a){

        String questions = theQustions[a];

        return questions;
    }

    public String getChoices1(int a){

        String choices = theChoices[a] [0];

        return choices;
    }
    public String getChoices2(int a){

        String choices = theChoices[a] [1];

        return choices;
    }
    public String getChoices3(int a){

        String choices = theChoices[a] [2];

        return choices;
    }
    public String getChoices4(int a){

        String choices = theChoices[a] [3];

        return choices;
    }

    public String getCorrectAnswers(int a){

        String answer = theCorrectAnswers[a];

        return answer;
    }
}

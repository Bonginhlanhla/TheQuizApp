package com.example.admin.thequizapp;

/**
 * Created by Admin on 6/6/2017.
 */

public class PoliticsQuestions {

    public String theQustions [] = {

            "Who is the current Minister of Arts and Culture?",
            "Who is the current Minister of Basic Education?",
            "Who is the current Minister of Communications?",
            "Who is the current Minister of Finance?",
            "Who is the current Minister of Police?",
            "Who is the current Minister of Water and Sanitation?",
            "Who is the current Minister of Tourism?"

    };

    public String theChoices [] [] = {

            {"Mr Ebrahim Patel","Mr Emmanuel Mthethwa","Ms Ayanda Dlodlo","Ms Nosiviwe Mapisa-Nqakula"},
            {"Ms Matsie Motshekga","Dr Hlengiwe Mkhize","Dr Pakishe Motsoaledi","Mr Fikile Mbalula"},
            {"Ms Ayanda Dlodlo","Faith Muthambi","Mr Jeffrey Radebe","Ms Bathabile Dlamini"},
            {"Mr Knowledge Gigaba","Mr Ebrahim Patel","Dr Robert Davies","Ms Nomvula Mokonyane"},
            {"Mr Mkhacani Maswanganyi","Mr Jeffrey Radebe","Adv Tshililo Masutha","Mr Fikile Mbalula"},
            {"Ms Grace Pandor","Mr Ebrahim Patel","Ms Nomvula Mokonyane","Dr Hlengiwe Mkhize"},
            {"Ms Tokozile Xasa","Mr Emmanuel Mthethwa","Ms Ayanda Dlodlo","Ms Lindiwe Sisulu"}

    };

    private String theCorrectAnswers [] = {"Mr Emmanuel Mthethwa","Ms Matsie Motshekga","Ms Ayanda Dlodlo","Mr Knowledge Gigaba","Mr Fikile Mbalula","Ms Nomvula Mokonyane","Ms Tokozile Xasa"};

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

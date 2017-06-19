package com.example.admin.thequizapp;

/**
 * Created by Admin on 6/6/2017.
 */

public class MusicQuestions {

    public String theQustions [] = {

            "Who won the 2015 SAMA for ‘Record of the Year’?",
            "Where was Cassper Nyovest born?",
            "What’s the name of Nhlanhla Nciza’s clothing line?",
            "What was the title of Mafikizolo’s debut album?",
            "What is DJ Black Coffee’s real name?",
            "What year did Bucie release her debut single “Ngicel’indoda”?",
            "How old is Afro-Soul singer, Lira?"

    };

    public String theChoices [] [] = {

            {"K.O FT KID X- Carara ","Black Motion ","AKA - ALL EYS ON ME","Kwesta - Ngu'D"},
            {"Gugulethu","Mafikeng","Soweto","Mpumalanga"},
            {"NN Enterprise","Design by Nhlanhla","Afro-star","Ncinza Clothing"},
            {"Music Revolution","Gatecrashers","Mafikizolo","Re-Union"},
            {"Oscar Bonginkosi Madlongwa","Nkosinathi Maphumulo","Thato Sikwane","Sipho Makathini"},
            {"2008","2006","2007","2009"},
            {"32","36","28","29"}

    };

    private String theCorrectAnswers [] = {"K.O FT KID X- Carara ","Mafikeng","Design by Nhlanhla","Mafikizolo","Nkosinathi Maphumulo","2008","32"};

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

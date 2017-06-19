package com.example.admin.thequizapp;



public class Questions {
    public String theQustions [] = {

            "What is the biggest tree in South Africa?",
            "What is the Tallest Mountain in Africa?",
            "What is the longest River in South Africa?",
            "What is South Africa’s biggest export?",
            "What is the largest Game reserve in Africa",
            "Which is the worls largest Ocean?",
            "How long does it take for the Earth to Revolve once on its Axis?"

    };

    public String theChoices [] [] = {

            {"Buffalothorn","baobab tree","Marula","Mopane"},
            {"Mount Khenya","Mawenzi","Mount Speke","Mount Kilimanjaro"},
            {"Limopo River","Orange River","Great Fish River","Vaal River"},
            {"Platinum","Zirconium","Palladium","Gold"},
            {"Masai Mara National Reserve","Serengeti National Park","Chobe National Park","Kruger National Park"},
            {"Indian Ocean","Atlantic Ocean","Pacific","Arctic Ocean"},
            {"48hours","24hours","72hours","96hours"}

    };

    private String theCorrectAnswers [] = {"baobab tree","Mount Kilimanjaro","Orange River","Gold","Masai Mara National Reserve","Pacific","24hours"};

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

package com.example.hm2;
/* Este es el codigo de las preguntas, se requiere la clase entera para que funcione la survey */
public class Question {

    public String questions[] = {
            "Do you think this day will be a lasting impact?",
            "How well was the rest of the day until now?",
            "Do you feel this can happen again?"
    };

    public String choices[][] = {
            {"Absolutely", "Hope not", "Could be", "Not a chance"},
            {"same or worse", "Good enough", "Same as always", "Pretty good"},
            {"Definitely", "Wish it doesn't", "Probably", "I don't think so"}
    };

    public String correctAnswer[] = {
            "Absolutely",
            "Pretty good",
            "Probably"
    };

    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }

}
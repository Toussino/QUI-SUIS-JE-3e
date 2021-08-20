package com.toussinodev.quisuis_je3e.model_questionnaire;

public class Model_fleaux {



    public String myQuestion [] = {



            "Je suis l’addiction (ou la dépendance) à la consommation d’alcool",
            "Je suis le taux d’alcool dans le sang",
            "Je suis l’intoxication de l’organisme par le tabac",
            "Je suis une substance d’origine naturelle ou synthétique qui agit sur l’organisme en modifiant ses sensations ou son comportement",
            "Je suis une drogue qui agit sur le système nerveux et mon usage abusif provoque de graves perturbations physiques ou mentale",
            "Je suis une substance qui active le fonctionnement du système nerveux",
            "Je suis une substance qui ralentis l’activité du système nerveux",


    };




    private String nChoice [][] = {

            {"l’alcoolisme", "l’alcoolémie",  "l’alcoolique" , "l’alcool"},
            {"le soulard" ,  "l’alcoolique" , "l’alcoolémie" , "l’alcool"},
            {"le tabagisme" , "la nicotine" , "l’insomnie" , "la fumée"},
            {"une drogue" , "un droguiste" , "une droguerie" , "le cannabis"},
            {"la cocaïne" , "l’héroïne" , "la morphine" , "un stupéfiant"},
            {"une drogue" , "l’alcool" , "un stimulant" , "un excitant"},
            {"la stérilisation", "l’anesthésie",  "la sudation" , "un sédatif"},



    };



    private String correctReponse [] = {

            "l’alcoolisme" , "l’alcoolémie" , "le tabagisme" , "une drogue" , "un stupéfiant" , "un stimulant" , "un sédatif"
    };



    public String getQuestion (int a){
        String question = myQuestion[a];
        return question;
    }

    public String getChoice1 (int a){
        String choix = nChoice [a][0];
        return choix;
    }

    public String getChoice2 (int a){
        String choix = nChoice [a][1];
        return choix;
    }

    public String getChoice3 (int a){
        String choix = nChoice [a][2];
        return choix;
    }

    public String getChoice4 (int a){
        String choix = nChoice [a][3];
        return choix;
    }

    public  String getCorrectReponse(int a){
        String reponse = correctReponse [a];
        return reponse;
    }



}

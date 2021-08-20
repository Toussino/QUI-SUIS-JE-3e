package com.toussinodev.quisuis_je3e.model_questionnaire;

public class Model_muscle {

    public String myQuestion [] = {



            "Je suis l’extrémité effilé du muscle et je rattache le muscle à l’os",
            "Je suis responsable de la couleur rouge du muscle",
            "Je suis une contraction involontaire, brusque et douloureuse du muscle",
            "Je suis une exagération de l’élasticité du muscle",
            "Je suis une rupture des fibres musculaire",
            "Je surviens sur le muscle qui ne travaille pas",



    };



    private String nChoice [][] = {

            {"le muscle", "le tendon",  "la chair" , "la tendinite"},
            {"le globule rouge" ,  "le globulin" , "la myoglobine" , "la globine"},
            {"un reflex" , "la crampe" , "une déchirure musculaire" , "un claquage"},
            {"l’élongation" , "l’étirement" , "l’atrophie musculaire" , "la crampe"},
            {"la déchirure musculaire" , "le sarclage" , "la crampe" , "le claquage"},
            {"l’atrophie musculaire" , "la métamorphose" , "la contraction musculaire" , "le repos musculaire"},




    };


    private String correctReponse [] = {

            "le tendon" , "la myoglobine" , "la crampe" , "l’élongation" , "le claquage" , "l’atrophie musculaire"

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

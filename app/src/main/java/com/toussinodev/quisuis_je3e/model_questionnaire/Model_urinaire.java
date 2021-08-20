package com.toussinodev.quisuis_je3e.model_questionnaire;

public class Model_urinaire {



    public String myQuestion [] = {



            "Je suis la présence de glucose dans les urines",
            "Je suis une accumulation d’urée dans le sang suite à une inflammation du rein",
            "Je suis une accumulation d’acides urique dans les voies urinaires",
            "Je suis la présence de sang dans les urines",
            "Je conduis l’urine du lieu de fabrication au lieu d’accumulation",
            "Je suis la présence d’albumine dans les urines",
            "Je suis l’organe de production de l’urine",
            "Je suis le lieu d’accumulation des urines avant l’excrétion",





    };





    private String nChoice [][] = {

            {"le sucre", "la glycémie",  "la glycosurie" , "la saccarose"},
            {"l’urine" ,  "l’uretère" , "l’urémie" , "le rein"},
            {"les calculs biliaire" , "les calculs binaires" , "les calculs urinaires" , "les calculs rénale"},
            {"l’hématome" , "l’hématurie" , "l’hémorragie" , "l’hémorroïde"},
            {"le canal urinaire" , "l’uretère" , "l’urine" , "la vésicule biliaire"},
            {"l’albuminurie" , "l’aluminerie" , "la vessie" , "l’armurerie"},
            {"les poumons", "l’estomac",  "le cœur" , "le rein"},
            {"la bourse" , "la vessie" , "le rein" , "l’appendis"},






    };



    private String correctReponse [] = {

            "la glycosurie" , "l’urémie" , "les calculs urinaires" , "l’hématurie" , "l’uretère" , "l’albuminurie" , "le rein" , "la vessie"

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

package com.toussinodev.quisuis_je3e.model_questionnaire;

public class Model_maternite {



    public String myQuestion [] = {



            "Je suis le lieu de rencontre entre le spermatozoïde et l’ovule",
            "Je suis l’émission du sperme par le pénis",
            "Je suis la fusion entre le sperme et l’ovule",
            "Je résulte de la fusion entre le sperme et l’ovule",
            "Je suis le lieu de développement du fœtus au cours de la grossesse",
            "Je suis la fixation de l’œuf dans la muqueuse utérine",
            "Je consiste à ouvrir chirurgicalement la paroi abdominale puis utérine pour extraire l’enfant",
            "Je suis le lait secrété les trois jours après l’accouchement",
            "Je suis l’ensemble des procédés permettant à un couple d’avoir des relations sexuelles sans risque de grossesse",
            "Je suis un comprimé contenant une hormone ovarienne de synthèse et j’empêche l’ovulation",
            "Je suis l’expulsion spontanée ou provoquée du fœtus avant six (06) mois de grossesse",





    };




    private String nChoice [][] = {

            {"le tiers inferieur de la trompe", "le tiers supérieur de la trompe",  "l’ovaire" , "la case thoracique"},
            {"l’arrosage" ,  "l’éjaculation" , "le tuyautage" , "l’éjection"},
            {"la féconde" , "la fécondité" , "la fécondation" , "la fédération"},
            {"l’œuf ou zygote" , "le fœtus" , "l’ambrions" , "l’ovulation"},
            {"le col" , "la colle" , "l’utérus" , "le collet"},
            {"l’ovulation" , "la fixité" , "la fixation" , "la nidation"},
            {"l’opération", "la cicatrisation",  "la césarienne" , "l’extraction"},
            {"le colostrum" , "le rectum" , "le colastrum" , "le colisée"},
            {"la consécration" , "la contraception" , "la contravention" , "la convention"},
            {"le stérilet" , "le t" , "le préservatif" , "une pilule contraceptive"},
            {"la césarienne" , "l’accouchement" , "l’avortement" , "l’accouchement in vitro"},







    };


    private String correctReponse [] = {

            "le tiers supérieur de la trompe" , "l’éjaculation" , "la fécondation" , "l’œuf ou zygote" , "l’utérus" , "la nidation" , "la césarienne" , "le colostrum" , "la contraception" , "une pilule contraceptive" , "l’avortement"

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

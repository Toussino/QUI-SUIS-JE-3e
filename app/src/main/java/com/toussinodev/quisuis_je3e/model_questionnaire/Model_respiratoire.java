package com.toussinodev.quisuis_je3e.model_questionnaire;

public class Model_respiratoire {


    public String myQuestion [] = {



            "Je suis le carrefour des voies digestives et respiratoire",
            "J’assure le renouvellement de l’air dans les poumons",
            "Je suis protégé par une membrane appelée plèvre qui me rattache à la case thoracique",
            "Je suis le lieu où se déroule l’échange gazeux entre le sang et l’air",
            "Je suis l’ensemble formé par les voies respiratoire et les poumons",
            "Je suis le regroupement de plusieurs lobules pulmonaire",
            "Je suis l’unité physiologique du poumon",
            "Je suis la partie superficielle des fosses nasale",
            "Je suis un tuyau de 12 à 15 cm de long maintenu ouvert par des anneaux de cartilages",
            "Je suis le nombre de mouvements respiratoire en une minute",
            "Je suis l’appareil qui sert à mesurer le volume d’air inspiré ou expiré",
            "Je suis la somme de l’air courant, de l’air complémentaire et de l’air de réserve",
            "Je transporte les gaz respiratoires",
            "Je suis le volume d’air qui rentre et qui sort des poumons au cours d’une respiration normale",
            "Je suis l’air qui pénètre dans les poumons au cours d’une respiration forcée",
            "Je suis l’air qui sort des poumons au cours d’une expiration forcée",
            "Je suis l’air restant dans les poumons après d’une expiration forcée",
            "Je suis la membrane qui enveloppe le poumon",
            "Je suis l’arrêt momentané de la respiration",







    };



    private String nChoice [][] = {

            {"le pharynx", "le larynx",  "l’œsophage" , "la trachée artère"},
            {"les mouvements respiratoires" ,  "la respiration" , "l’inspiration" , "l’expiration"},
            {"le cœur" , "l’estomac" , "la bile" , "le poumon"},
            {"l’artère pulmonaire" , "la vésicule pulmonaire" , "l’alvéole pulmonaire" , "l’artère aorte"},
            {"l’appareil digestif" , "l’appareil urinaire" , "l’appareil circulatoire" , "l’appareil respiratoire"},
            {"le globe" , "le lobe pulmonaire" , "l’aube" , "l’aube pulmonaire"},
            {"le globule pulmonaire", "le globe pulmonaire",  "le lobule pulmonaire" , "la valvule pulmonaire"},
            {"la bouche" , "le nez (les narines)" , "les dents" , "les poumons"},
            {"le gros intestin" , "la trachée artère" , "l’intestin grêle" , "l’œsophage"},
            {"le rythme respiratoire" , "la respiration" , "le souffle" , "la rétention"},
            {"le spiromètre" , "le pyromètre" , "le stéthoscope" , "le stérilet"},
            {"la capacite respiratoire" , "la capacite vitale" , "l’incapacité respiratoire" , "l’incapacité vitale"},
            {"le globulin", "le globule",  "l’hématie" , "l’hémoglobine"},
            {"l’air courant" , "l’air complémentaire" , "l’air résiduel" , "l’air fix"},
            {"l’air courant" , "l’air complémentaire" , "l’air résiduel" , "l’air moteur"},
            {"l’air courant" , "l’air complémentaire" , "l’air de réserve" , "l’air résiduel"},
            {"l’air courant" , "l’air complémentaire" , "l’air résiduel" , "l’air mix"},
            {"la lèvre" , "la levure" , "le diaphragme" , "la plèvre"},
            {"l’acné" , "le coma" , "l’asphyxie" , "la respiration"},







    };



    private String correctReponse [] = {

            "le pharynx" , "les mouvements respiratoires" , "le poumon" , "l’alvéole pulmonaire" , "l’appareil respiratoire" , "le lobe pulmonaire" , "le lobule pulmonaire" , "le nez (les narines)" , "la trachée artère" , "le rythme respiratoire" , "le spiromètre" , "la capacite vitale" , "l’hémoglobine" , "l’air courant" , "l’air complémentaire" , "l’air de réserve" , "l’air résiduel" , "la plèvre" , "l’asphyxie"

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

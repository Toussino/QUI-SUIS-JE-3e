package com.toussinodev.quisuis_je3e.model_questionnaire;

public class Model_Squelette {



    public String myQuestion [] = {

            "Je suis une partie de l’organisme qui remplit une fonction bien déterminée",
            "Je suis l’unité anatomique et physiologique de l’organisme",
            "Je suis l’étude de la structure et de la forme des organes",
            "Je suis l’étude du fonctionnement des organes",
            "Je suis le seul os mobile de la tête",
            "Je suis la première vertèbre cervicale",
            "Je suis la deuxième vertèbre cervicale",
            "Je suis l’endroit où se fait la jonction de deux ou de plusieurs os",
            "Je suis un liquide qui facilite le glissement des os dans une articulation",
            "Je suis la substance organique des os",
            "Je suis la partie de l’os responsable de la croissance en longueur",
            "Je suis l’os du bras",
            "Je suis l’os de la cuisse",
            "Je suis formé d’un ensemble de 208 os",
            "Je suis une rupture de la continuité d’un os",
            "Je suis une substance sécrétée par une glande et je stimule le fonctionnement d’un autre organe",
            "Je suis une déformation latérale de la colonne vertébrale",
            "Je suis une exagération de la courbure lombaire",
            "Je suis une exagération de la courbure dorsale"

    };


    private String nChoice [][] = {

            {"un organe", "un organisme",  "une cellule" , "une dent"},
            {"la cellulose" ,  "la cellule" , "l’anatomie" , "la molécule"},
            {"la physiologie" , "l’anatomie" , "la biologie" , "pédologie"},
            {"la psychologie" , "la prophylaxie" , "la physiologie" , "physionomie"},
            {"le maxillaire inferieur" , "le scrotum" , "le fémur" , "le maxillaire supérieur"},
            {"la vertèbre lombaire" , "l’axis" , "le péroné" , "l’atlas"},
            {"le cervidé" , "l’axis" , "l’axiome" , "la maxime"},
            {"une articulation" , "l’accommodation" , "la commodité" , "l’os"},
            {"la cynovie" , "la cinovie" , "la sinovie" , "la synovie"},
            {"l’osséine" ,"la moelle" , "l’os spongieux" , "l'os mou"},
            {"le cartilage" , "l’os de croissance" , "le cartilage de conjugaison" , "la vertèbre"},
            {"l’omoplate" , "l’humérus" , "le radius" , "cubitus"},
            {"le fémur" , "le tibia" , "le métatarse" , "le péroné"},
            {"une vertèbre" , "le squelette" , "la colonne vertébrale" , "le corps humain"},
            {"une courbure" , "un espacement " , "une luxation  " , "une fracture"},
            {"une harmonie" , "une glande" , "une hormone" , "un organe"},
            {"la scoliose" , "la colopathie" , "la tendinite" , "la cyphose"},
            {"la lordose" , "la scoliose" , "la cyphose" , "la cambrure"},
            {"la colopathie" , "la rhytine" , "la tendinite" , "la cyphose"},



    };


    private String correctReponse [] = {

            "un organe" , "la cellule" , "l’anatomie" , "la physiologie" , "le maxillaire inferieur" , "l’atlas" , "l’axis" , "une articulation" , "la synovie" , "l’osséine" , "le cartilage de conjugaison" , "l’humérus" , "le fémur" , "le squelette" , "une fracture" , "une hormone" , "la scoliose" , "la lordose" , "la cyphose"

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

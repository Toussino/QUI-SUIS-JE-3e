package com.toussinodev.quisuis_je3e.model_questionnaire_niveau;

public class Model_niveau1 {



    public String myQuestion [] = {



            "Je suis une partie de l’organisme qui remplit une fonction bien déterminée",
            "Je suis l’extrémité effilé du muscle et je rattache le muscle à l’os",
            "Je suis la partie du système nerveux logé dans le crane",
            "Je suis la cavité dans laquelle est logé l’œil",
            "À chaud, je donne un précipité rouge brique en présence du glucose",
            "Je suis le lieu de production des globules rouges",
            "J’empêche le retour du sang des ventricules vers les oreillettes",
            "Je suis le carrefour des voies digestives et respiratoire",
            "Je suis la présence de glucose dans les urines",
            "Je suis le passage de l’enfance à l’adolescence",
            "Je suis une exagération de la courbure lombaire",
            "Je suis une exagération de la courbure dorsale",




    };





    private String nChoice [][] = {

            {"un organe", "un organisme",  "une cellule" , "une dent"},
            {"le muscle" ,  "le tendon" , "la chair" , "la tendinite"},
            {"l’encéphale" , "l ’encéphalogramme" , "la dure mère" , "la matrice"},
            {"le cristallin" , "l ‘orbite" , "la rétine" , "les cilles"},
            {"la liqueur de Fehling" , "le sulfate d’ammonium" , "le sulfate de cuivre" , "l ’alcool"},
            {"la moelle épinière" , "la moelle rouge" , "la moelle jaune" , "la moelle osseuse"},
            {"la valve auriculo-ventriculaire", "la valvule auriculo-ventriculaire",  "l’alvéole" , "la trachée artère"},
            {"le pharynx" , "le larynx" , "l’œsophage" , "la trachée artère"},
            {"le sucre" , "la glycémie" , "la glycosurie" , "la saccarose"},
            {"l’enfance" , "la puberté" , "la perturbation" , "l’adulte"},
            {"la lordose" , "la scoliose" , "la cyphose" , "la cambrure"},
            {"la colopathie" , "la rhytine" , "la tendinite" , "la cyphose"},



    };



    private String correctReponse [] = {

            "un organe" , "le tendon" , "l’encéphale" , "l ‘orbite" , "la liqueur de Fehling" , "la moelle osseuse" , "la valvule auriculo-ventriculaire" , "le pharynx" , "la glycosurie" , "la puberté" , "la lordose" , "la cyphose"

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

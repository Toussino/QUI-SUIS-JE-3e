package com.toussinodev.quisuis_je3e.model_questionnaire;

public class Model_aliment {


    public String myQuestion [] = {



            "À chaud, je donne un précipité rouge brique en présence du glucose",
            "En présence d’empois d’amidon, je donne une coloration bleue intense",
            "En présence du blanc d’œuf, je donne une coloration violette",
            "Je suis constitué de plusieurs aliments simples",
            "Je suis une maladie provoquée par une carence en vitamine",
            "Ma carence entraine une baisse de la vision crépusculaire et un arrêt de la croissance",
            "Je suis la quantité d’aliments qu’un individu doit consommer par jour pour maintenir son poids et sa santé",
            "Je secrète la salive",
            "Je suis l’ensemble des aliments brassés et imprégnés du suc gastrique",
            "Je suis secrété par le foie et je neutralise l’action du chyme stomacale",
            "Je suis le processus au cours duquel les grosses particules sont transformées en substance fine pouvant passer dans le sang",
            "Je suis une bouillie blanchâtre résultant de la digestion",
            "Je suis l’altération progressive du tissu dur de la dent",





    };


    private String nChoice [][] = {

            {"la liqueur de Fehling", "le sulfate d’ammonium",  "le sulfate de cuivre" , "l ’alcool"},
            {"l’eau iodée" ,  "l ’eau anodisée" , "sulfate de soude" , "l ’ammoniaque"},
            {"le sulfate de cuivre" , "le sulfate de zinc" , "la liqueur de Fehling" , "le nitrate d’argent"},
            {"un aliment composite" , "un aliment décomposé" , "un aliment multiple" , "un aliment compose"},
            {"l'albumine" , "l’alcaline" , "l’alvéole" , "une avitaminose"},
            {"la vitamine A" , "la vitamine B" , "la vitamine C" , "la vitamine D"},
            {"la ration élémentaire", "la ration alimenterre",  "la ration alimentaire" , "la ration complémentaire"},
            {"les glandes salivaires" , "les glandes salivères" , "les glandes lacrymales" , "les glandes sauvages"},
            {"le chyme stomacal" , "la cime stomacal" , "la chine stomacal" , "le schisme stomacale"},
            {"la bile" , "la bille" , "le billet" , "le baille"},
            {"l’ingérence" , "la digestions" , "la digestion" , "l’injection"},
            {"la matière fécale" , "le chyle" , "le cil" , "la cime"},
            {"la carie dentaire", "l ’hypersensibilité",  "le bruxisme" , "la tendinite"},






    };



    private String correctReponse [] = {

            "la liqueur de Fehling" , "l’eau iodée" , "le sulfate de cuivre" , "un aliment compose" , "une avitaminose" , "la vitamine A" , "la ration alimentaire" , "les glandes salivaires" , "le chyme stomacal" , "la bile" , "la digestion" , "le chyle" , "la carie dentaire"

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

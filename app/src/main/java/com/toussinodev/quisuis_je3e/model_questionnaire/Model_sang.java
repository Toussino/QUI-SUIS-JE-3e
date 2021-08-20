package com.toussinodev.quisuis_je3e.model_questionnaire;

public class Model_sang {



    public String myQuestion [] = {



            "Je suis le lieu de production des globules rouges",
            "J’interviens dans le transport de l’oxygène et du gaz carbonique",
            "Je résulte de la combinaison entre l’hémoglobine et l’oxygène",
            "Je résulte de la combinaison entre l’hémoglobine et le gaz carbonique",
            "Je suis le phénomène par lequel les leucocytes traversent les parois des capillaires",
            "Je suis le phénomène par lequel les globules blancs capturent et digèrent les microbes",
            "Je suis une cellule sanguine dont le rôle est la défense de l’organisme",
            "J’interviens dans la coagulation du sang pour arrêter l’hémorragie",
            "Je suis une opération qui consiste à apporter mon sang à quelqu’un qui en a besoin",
            "Je peux recevoir du sang provenant de tous les autres groupes sanguins",
            "Je peux donner mon sang à tous les autres groupes sanguins",
            "Je suis une maladie caractérisée par une coagulation lente du sang",
            "Ma carence peut entrainer une coagulation lente du sang",
            "Je suis une maladie héréditaire de la race noire due à une transformation de l’hémoglobine Hba en hémoglobine Hbs",
            "Je suis un globule rouge recourbé en faucille",
            "Je suis un examen médical permettant de déterminer les types d’hémoglobines",





    };



    private String nChoice [][] = {

            {"la moelle épinière", "la moelle rouge",  "la moelle jaune" , "la moelle osseuse"},
            {"le globulin" ,  "le globule roux" , "le globule blanc" , "l ’hémoglobine"},
            {"l’emoglobinisation" , "l’oxygénation" , "l’oxyhémoglobine" , "l’oxygenoglobine"},
            {"la gazéification" , "la carbohémoglobine" , "la carbonisation" , "l ’homogénéisation"},
            {"la diapédèse" , "la perforation" , "la pénétration" , "le diaporamas"},
            {"le bulbe rachidien" , "la phagocytose" , "la digestion" , "l ’ingestion"},
            {"le globule rouge", "le globulin",  "le globule blanc ou leucocyte" , "le lieutenant"},
            {"la plaquette sanguine ou globulin" , "hématome" , "le sang" , "la plaque sanguine"},
            {"le don de sang" , "la transfusion sanguine" , "le frotti sanguin" , "la plaquette sanguine"},
            {"le receveur universel (AA RH+)" , "le receveur universel (B RH+)" , "le receveur universel (AB RH+)" , "le receveur universel (O RH+)"},
            {"le donneur universel (O RH+)" , "le donneur universel (O RH-)" , "le donneur universel (AB RH-)" , "le donneur universel (C RH-)"},
            {"l’hémophilie" , "l’hemophylie" , "l’hémorragie" , "l’hématie"},
            {"la vitamine d", "la vitamine c",  "la vitamine b" , "la vitamine K"},
            {"la syphilis", "la drépanocytose",  "l ’arthrose" , "l’anémie"},
            {"un drépanocyte" ,  "l’hépatite" , "l’hématie" , "la cambrure"},
            {"l’électrocardiogramme" , "l’électrolyse" , "l’électrophorèse" , "l’électrophoraise"},






    };


    private String correctReponse [] = {

            "la moelle osseuse" , "l ’hémoglobine" , "l’oxyhémoglobine" , "la carbohémoglobine" , "la diapédèse" , "la phagocytose" , "le globule blanc ou leucocyte" , "la plaquette sanguine ou globulin" , "la transfusion sanguine" , "le receveur universel (AB RH+)" , "le donneur universel (O RH-)" , "l’hémophilie" , "la vitamine K" , "la drépanocytose" , "un drépanocyte" , "l’électrophorèse"

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

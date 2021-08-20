package com.toussinodev.quisuis_je3e.model_questionnaire;

public class Model_nerveux {

    public String myQuestion [] = {



            "Je suis la partie du système nerveux logé dans le crane",
            "Je suis la partie du système nerveux logé dans le canal rachidien",
            "Je pars de l’encéphale et j’aboutis aux organes de sens",
            "Je suis la membrane qui est au contact de l’encéphale et de la moelle épinière",
            "Je suis la membrane nourricière du système nerveux",
            "Je suis le liquide contenu dans l’espace situé entre l’arachnoïde et la pie mère",
            "Je suis la membrane protectrice du système nerveux",
            "Je suis un ensemble de fibres nerveux enveloppé dans un tissu de protection",
            "Je suis l’unité anatomique et physiologique du système nerveux",
            "Je suis une perturbation qui prends naissance au niveau du point excité et je me propage le long du nerf",
            "Je conduis l’influx nerveux des centres vers les organes effecteurs",
            "Je conduis l’influx nerveux des organes de sens vers les centres",
            "Je conduis   à la fois l’influx sensitif et l’influx moteur",
            "Je suis le siège de tout mouvement volontaire",
            "Je suis une grenouille dont l’encéphale a été détruit",
            "Je suis une grenouille qui n’a que la moelle épinière comme centre nerveux",
            "Je suis le centre qui commande les mouvements reflexes",
            "Je suis un réflexe qui a pour centre la moelle épinière",
            "Je suis responsable de la coordination des mouvements et de l’équilibre du corps",
            "Je suis la liaison entre l’encéphale et la moelle épinière",
            "Je suis une vitamine dont l’absence entraine le béribéri",
            "Je suis une vitamine dont l’absence entraine la pellagre",



    };


    private String nChoice [][] = {

            {"l’encéphale", "l’encéphalogramme",  "la dure mère" , "la matrice"},
            {"la moelle épinière" ,  "l ’épine dorsale" , "moelle jaune" , "la moelle rouge"},
            {"la moelle épinière" , "les tendons" , "la veine cave" , "les nerfs crâniens"},
            {"le cerveau" , "le placenta" , "la moelle épinière" , "la pie mère"},
            {"la dure mère" , "la pie mère" , "la moelle épinière" , "le liquide céphalorachidien"},
            {"le liquide cérébro-rachidien" , "le liquide céphalo-rachidien" , "le liquide céphalo-spinal" , "la glande cervicale"},
            {"la pie mère" , "le placenta" , "la vessie" , "la dure mère"},
            {"le nerf" , "la cellule" , "le neurone" , "les nervures"},
            {"le nerf crânien" , "la cellule nerveuse" , "le neurone ou cellule nerveuse" , "le nerf"},
            {"le mouvement reflexe", "l’excitation",  "le flux nerveux" , "l ’influx nerveux"},
            {"le nerf moteur" ,  "le nerf sensitif" , "le nerf cervical" , "le nerf du muscle"},
            {"le nerf moteur" , "le nerf sensitif" , "le vaisseau sanguin" , "le courant électrique"},
            {"le nerf moteur" , "le nerf sensitif" , "le nerf mixte" , "le cerveau"},
            {"le cerveau" , "l ’aire motrice ou substance grise du cerveau" , "la substance blanche du cerveau" , "la carotide"},
            {"une grenouille agonisante" , "une grenouille spirale" , "une grenouille encéphale" , "une grenouille spinale"},
            {"une grenouille spinale" , "grenouille médullaire" , "grenouille pénale" , "grenouille cérébrale"},
            {"le bulbe rachidien" , "liquide céphalorachidien" , "la moelle épinière" , "le cerveau"},
            {"un réflexe médullaire", "un réflexe spinal",  "un réflexe moteur" , "un réflexe modulaire"},
            {"le bulbe rachidien" ,  "la substance grise" , "le cervelet" , "la moelle épinière"},
            {"le nerf" , "le bulbe rachidien" , "le cerveau" , "la vertèbre cervicale"},
            {"la vitamine b1" , "la vitamine b2" , "la vitamine b12" , "la vitamine a"},
            {"la vitamine c" , "la vitamine d" , "la vitamine p" , "la vitamine pp"},
            




    };



    private String correctReponse [] = {

            "l’encéphale" , "la moelle épinière" , "les nerfs crâniens" , "pie mère" , "la pie mère" , "le liquide céphalo-rachidien" , "la dure mère" , "le nerf" , "le neurone ou cellule nerveuse" , "l ’influx nerveux" , "le nerf moteur" , "le nerf sensitif" ,  "le nerf mixte" , "l ’aire motrice ou substance grise du cerveau" , "une grenouille spinale" , "une grenouille spinale" , "la moelle épinière" , "un réflexe médullaire" , "le cervelet" , "le bulbe rachidien" , "la vitamine b1" , "la vitamine pp"

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

package com.toussinodev.quisuis_je3e.model_questionnaire;

public class Model_maladie {


    public String myQuestion [] = {



            "Je suis le traitement d’une maladie",
            "Je suis le traitement d’une maladie à l’aide de substances chimiques",
            "Je suis une maladie qui existe de façon permanente dans une région donnée",
            "Je suis une maladie infectieuse qui atteint en même temps un grand nombre de personnes",
            "Je suis la manifestation clinique d’une maladie",
            "Je suis le temps compris entre l’introduction d’un microbe dans l’organisme et l’apparition des premiers symptômes",
            "Je suis la propriété que possède l’organisme à être réfractaire à un agent infectieux",
            "Je suis une maladie causée par un virus",
            "Je suis l’agent responsable de la rage",
            "Je suis l’agent causal du sida",
            "Je suis l’agent responsable du tétanos",
            "Je suis le germe responsable de la tuberculose pulmonaire",
            "Je suis le germe responsable de la syphilis",
            "Je suis l’agent causal du paludisme",
            "Je suis l’agent vecteur du paludisme",
            "Je suis une substance curative extraite d’un animal vacciné et injecté à un individu malade",
            "Je suis une culture de germes atténué servant à provoquer la production d’anticorps spécifique contre les germes virulents",
            "Je suis la science qui étudie les microbes",
            "Je suis une bactérie à forme sphérique",
            "Je suis une bactérie capable de fabriquer sa propre substance",
            "Je suis une bactérie qui se nourrit des matières organiques en décomposition",
            "Je suis une bactérie qui a besoin d’oxygène pour survivre",
            "Je suis une forme de résistance des bactéries",
            "Je suis l’introduction des microbes dans l’organisme suivie de leurs proliférations pour envahir l’organisme",
            "Je suis une infection généralisée de tout l’organisme",
            "Je suis une méthode préventive consistant à empêcher l’introduction des microbes dans l’organisme",
            "Je suis une méthode préventive consistant à détruire les microbes à la surface de la peau ou dans les plaies",
            "Je confère à l’organisme une immunité acquise",
            "Je suis le traitement d’une maladie par le sérum",
            "Je suis le traitement d’une maladie par les antibiotiques",
            "Je consiste à élever la température d’un aliment à 70° environ dans le but d’augmenter sa durée de conservation",






    };




    private String nChoice [][] = {

            {"le traitement", "la posologie",  "la thérapie" , "le médicament"},
            {"la chimiothérapie" ,  "la chirurgie" , "la chimie" , "la pharmacie"},
            {"une pandémie" , "une endémie" , "épidémie" , "une infection"},
            {"une pandémie" , "une épidémie" , "une endémie" , "une bactérie"},
            {"le signe" , "le virus" , "la manipulation" , "le symptôme"},
            {"l’incubation" , "la gestation" , "la fécondation" , "l’accouchement"},
            {"l’immunité", "la vulnérabilité",  "l’accoutumance" , "la dépendance"},
            {"EBOLA" , "le SIDA" , "le paludisme" , "une maladie virale"},
            {"le virus radial" , "le virus rabique" , "le virus radical" , "la bacille de koch"},
            {"le virus de l’immunodéficience acquise (VIH)" , "le virus de l’immunodéficience humeur (VIH)" , "le visite de l’immuno- défaillance acquise (VIH)" , "le virus de l’immunodéficience aqueuse (VIH)"},
            {"le virus tétanique" , "le bacille tétanique ou bacille de Nicolaier" , "le bacille de koch" , "le VIH"},
            {"le VIH" , "le plasmodium" , "le bacille de koch" , "bacille de Nicolaier"},
            {"le tréponème virus", "le tréponème pâle",  "le tréponème mâle" , "le tréponème sale"},
            {"le plasmodium", "le placentas",  "l’anophèle" , "le mariage"},
            {"le plasmodium" ,  "l’anophèle femelle" , "l’anophèle mâle" , "la malaria"},
            {"le sérum" , "le liquide jaune" , "l’injection" , "le scrotum"},
            {"le vaccin" , "la vaccination" , "la ventilation" , "le sérum"},
            {"la microbiologie" , "la nano biologie" , "la cosmologie" , "la biochimie"},
            {"les coques" , "les coqs" , "les coachs" , "le koch"},
            {"une bactérie automorphe", "une bactérie autotrophe",  "une bactérie autophile" , "une bactérie auto compact"},
            {"une bactérie hétérotrophe" , "une bactérie homophobe" , "une bactérie autotrophe" , "une bactérie amorphe"},
            {"une bactérie aérobie" , "une bactérie autotrophe" , "une bactérie amorphe" , "une hématie"},
            {"l’anti defense" , "la sporulation" , "la pullulation" , "la sponsorisation"},
            {"l’envahissement" , "la colonisation" , "l’infection microbienne" , "l’injection microbienne"},
            {"la paralysie" , "la septicémie" , "la contraction" , "la colonisation"},
            {"l’ASM", "le spasme",  "l’apothéose" , "l’asepsie"},
            {"la stérilisation" , "la cautérisation" , "l’antisepsie" , "l’anti paludéen"},
            {"le sérum" , "l’injection" , "le médicament" , "le vaccin"},
            {"sérothérapie", "la thérapie",  "les soins" , "l’anesthésie locale"},
            {"antibiothérapie" , "sérothérapie" , "l’Aero thérapie" , "l’injection"},
            {"la conservation" , "la pasteurisation" , "la stérilisation" , "la préparation"},







    };



    private String correctReponse [] = {

            "la thérapie" , "la chimiothérapie" , "une endémie" , "une épidémie" , "le symptôme" , "l’incubation" , "l’immunité" , "une maladie virale" , "le virus rabique" , "le virus de l’immunodéficience acquise (VIH)" , "le bacille tétanique ou bacille de Nicolaier" , "le bacille de koch" , "le tréponème pâle" , "le plasmodium" , "l’anophèle femelle" , "le sérum" , "le vaccin" , "la microbiologie" , "les coques" , "une bactérie autotrophe" , "une bactérie hétérotrophe" , "une bactérie aérobie" , "la sporulation" , "l’infection microbienne" , "la septicémie" , "l’asepsie" , "l’antisepsie" , "le vaccin" , "sérothérapie" , "antibiothérapie" , "la pasteurisation"

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

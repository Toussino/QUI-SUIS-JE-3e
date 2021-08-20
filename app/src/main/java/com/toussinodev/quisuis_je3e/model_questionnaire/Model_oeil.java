package com.toussinodev.quisuis_je3e.model_questionnaire;

public class Model_oeil {


    public String myQuestion [] = {



            "Je suis la cavité dans laquelle est logé l’œil",
            "Je suis la glande qui secrète les larmes",
            "Je suis la membrane nourricière de l’œil",
            "Je suis la membrane protectrice de l’œil",
            "Je suis la capacité de l’œil à voir distinctement les objets rapprochés",
            "Je suis responsable de l’accommodation de l’œil",
            "Je règle le diamètre de la pupille en fonction de la lumière",
            "Je suis responsable de la vision en colleur",
            "Je suis responsable de la vision crépusculaire",
            "Je suis une anomalie de la vision dans laquelle l’œil ne voie pas distinctement les objets rapprochés",
            "Je suis une anomalie de la vision dans laquelle l’œil ne voie pas distinctement les objets éloignés",
            "Je suis une anomalie héréditaire caractérisée par l’incapacité à distinguer le rouge et le vert",
            "Je suis une anomalie caractérisée par une diminution de l’élasticité du cristallin",
            "Je suis dû à une opacification du cristallin",




    };



    private String nChoice [][] = {

            {"le cristallin", "l'orbite",  "la rétine" , "les cilles"},
            {"la glande lacrimale" ,  "la glande lacrymale" , "la glande de larmoiement" , "la tyroïde"},
            {"la carotide" , "la choroïde" , "la rétine" , "la pupille"},
            {"la sclérotique" , "la membrane hyaloïde" , "le corps vitre" , "la cornée"},
            {"le gonflement" , "l ’accoutumance" , "le zoom" , "l’accommodation"},
            {"les cristaux" , "le cristallin" , "les cônes" , "les batônnets"},
            {"l’iris", "les cellules en batônnets",  "les cellules en cône" , "la pupille"},
            {"les cellules en batônnets" ,  "les cellules en cônes" , "le cristallin" , "la rétine"},
            {"les cellules en batônnets" , "le ligament supérieur" , "la chambre antérieur ou humeur aqueuse" , "la cornée"},
            {"l’atrophie" , "la superpétrolier" , "l’hypermétropie" , "la myopie"},
            {"le daltonisme" , "la presbytie" , "la myopie" , "la cataracte"},
            {"le daltonisme" , "la rougeole" , "la myopie" , "le béribéri"},
            {"la lordose", "la presbytie",  "la triode" , "la décalcomanie"},
            {"le katana" ,  "le carra" , "la myopie" , "la cataracte"},





    };


    private String correctReponse [] = {

            "l'orbite" , "la glande lacrymale" , "la choroïde" , "la sclérotique" , "l’accommodation" , "le cristallin" , "l’iris" , "les cellules en cônes" , "les cellules en batônnets" , "l’hypermétropie" , "la myopie" , "le daltonisme" , "la presbytie" , "la cataracte"

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

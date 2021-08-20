package com.toussinodev.quisuis_je3e.model_questionnaire;

public class Model_caracteristique {


    public String myQuestion [] = {



            "Je suis le passage de l’enfance à l’adolescence",
            "Je suis un organe en forme de haricot logé dans le scrotum ou bourse",
            "Je suis l’organe d’accouplement mâle",
            "Je suis la partie terminale du pénis et je protège le gland",
            "Je suis l’organe (glande) reproductrice sécrétant les hormones mâles",
            "Je suis la glande reproductrice femelle",
            "Je suis l’organe d’accouplement de la femme",
            "Je suis l’organe érectile de la femme",
            "Je suis l’organe érectile de l’homme",
            "Je suis la cellule reproductrice femelle",
            "Je suis la cellule reproductrice mâle",
            "Je suis l’expulsion de l’ovule par l’ovaire",
            "Je suis l’hémorragie cyclique de la paroi de l’utérus",
            "Je suis l’arrêt de la fertilité de la femme",
            "Je secrète la testostérone",






    };




    private String nChoice [][] = {

            {"l’enfance", "la puberté",  "la perturbation" , "l’adulte"},
            {"le testicule" ,  "le rein" , "l’œuf" , "la vessie"},
            {"le pubis" , "le pénis" , "le vagin" , "le bâton"},
            {"la capsule" , "le prépuce" , "la puce" , "l’enveloppe"},
            {"le testicule" , "les hormones" , "le testostérone" , "le sang"},
            {"les ovules" , "les ovaires" , "le sperme" , "le pénis"},
            {"le pénis", "le vagin",  "l’ovule" , "le pubis"},
            {"la clôture" , "le troue" , "le vagin" , "le clitoris"},
            {"le vagin" , "le pénis" , "la pénétration" , "la perforation"},
            {"la vessie" , "l’ovaire" , "l’ovule" , "l’ovulation"},
            {"le sperme" , "le spermatozoïde" , "la spermatogonie" , "la suprématie"},
            {"l’ovule" , "l’ovulation" , "la gestation" , "l’œuf"},
            {"les règles ou menstrues", "la fécondation",  "la stérilité" , "la ménopause"},
            {"la stérilité" , "la stérilisation" , "la contraception" , "la ménopause"},
            {"la glande", "le gland",  "le testicule" , "le tétanos"},






    };



    private String correctReponse [] = {

            "la puberté" , "le testicule" , "le pénis" , "le prépuce" , "le testicule" , "les ovaires" , "le vagin" , "le clitoris" , "le pénis" , "l’ovule" , "le spermatozoïde" , "l’ovulation" , "les règles ou menstrues" , "la ménopause" , "le testicule"

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

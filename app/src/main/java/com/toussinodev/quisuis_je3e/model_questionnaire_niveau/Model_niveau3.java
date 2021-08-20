package com.toussinodev.quisuis_je3e.model_questionnaire_niveau;

public class Model_niveau3 {



    public String myQuestion [] = {



            "J’assure le renouvellement de l’air dans les poumons",
            "Je suis une accumulation d’urée dans le sang suite à une inflammation du rein",
            "Je suis un organe en forme de haricot logé dans le scrotum ou bourse",
            "Je suis l’émission du sperme par le pénis",
            "Je suis le traitement d’une maladie à l’aide de substances chimiques",
            "Je suis le taux d’alcool dans le sang",
            "Je suis l’étude de la structure et de la forme des organes",
            "Je suis une contraction involontaire, brusque et douloureuse du muscle",
            "Je pars de l’encéphale et j’aboutis aux organes de sens",
            "Je suis la membrane nourricière de l’œil",
            "En présence du blanc d’œuf, je donne une coloration violette",
            "Je résulte de la combinaison entre l’hémoglobine et l’oxygène",
            "Je suis la phase de contraction des ventricules",
            "Je suis protégé par une membrane appelée plèvre qui me rattache à la case thoracique",
            "Je suis une accumulation d’acides urique dans les voies urinaires",
            "Je suis l’organe d’accouplement mâle",
            "Je suis la fusion entre le sperme et l’ovule",
            "Je suis une maladie qui existe de façon permanente dans une région donnée",
            "Je suis l’intoxication de l’organisme par le tabac",
            "Je suis l’étude du fonctionnement des organes",
            "Je suis une vitamine dont l’absence entraine la pellagre",
            "Je suis dû à une opacification du cristallin",






    };




    private String nChoice [][] = {

            {"les mouvements respiratoires", "la respiration",  "l’inspiration" , "l’expiration"},
            {"l’urine" ,  "l’uretère" , "l’urémie" , "le rein"},
            {"le testicule" , "le rein" , "l’œuf" , "la vessie"},
            {"l’arrosage" , "l’éjaculation" , "le tuyautage" , "l’éjection"},
            {"la chimiothérapie" , "la chirurgie" , "la chimie" , "la pharmacie"},
            {"le soulard" , "l’alcoolique" , "l’alcoolémie" , "l’alcool"},
            {"la physiologie", "l ’anatomie",  "la biologie" , "pédologie"},
            {"un reflex" , "la crampe" , "une déchirure musculaire" , "un claquage"},
            {"la moelle épinière" , "les tendons" , "la veine cave" , "les nerfs crâniens"},
            {"la carotide" , "la choroïde" , "la rétine" , "la pupille"},
            {"le sulfate de cuivre" , "le sulfate de zinc" , "la liqueur de Fehling" , "le nitrate d’argent"},
            {"l’emoglobinisation" , "l’oxygénation" , "l’oxyhémoglobine" , "l’oxygenoglobine"},
            {"la systole ventriculaire", "l’orbite",  "la systole auriculaire" , "le poumon"},
            {"le cœur" , "l’estomac" , "la bile" , "le poumon"},
            {"les calculs biliaire", "les calculs binaires",  "les calculs urinaires" , "les calculs rénale"},
            {"le pubis" , "le pénis" , "le vagin" , "le bâton"},
            {"la féconde" , "la fécondité" , "la fécondation" , "la fédération"},
            {"une pandémie" , "une endémie" , "épidémie" , "une infection"},
            {"le tabagisme" , "la nicotine" , "l’insomnie" , "la fumée"},
            {"la psychologie", "la prophylaxie",  "la physiologie" , "physionomie"},
            {"la vitamine c" , "la vitamine d" , "la vitamine p" , "la vitamine pp"},
            {"le katana", "le carra",  "la myopie" , "la cataracte"},







    };


    private String correctReponse [] = {

            "les mouvements respiratoires" , "l’urémie" , "le testicule" , "l’éjaculation" , "la chimiothérapie" , "l’alcoolémie" , "l ’anatomie" , "la crampe" , "les nerfs crâniens" , "la choroïde" , "le sulfate de cuivre" , "l’oxyhémoglobine" , "la systole ventriculaire" , "le poumon" , "les calculs urinaires" , "le pénis" , "la fécondation" , "une endémie" , "le tabagisme" , "la physiologie" , "la vitamine pp" , "la cataracte"

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

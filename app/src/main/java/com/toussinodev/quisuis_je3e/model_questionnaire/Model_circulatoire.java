package com.toussinodev.quisuis_je3e.model_questionnaire;

public class Model_circulatoire {


    public String myQuestion [] = {



            "J’empêche le retour du sang des ventricules vers les oreillettes",
            "Je suis la phase de contraction des oreillettes",
            "Je suis la phase de contraction des ventricules",
            "Je suis la phase de repos du cœur",
            "Je suis la pression exercée par le sang sur la paroi des artères",
            "Je suis une élévation de la tension artérielle au-dessus de 14",
            "Je suis une chute de la tension artérielle au-dessous de 7",
            "Je conduis le sang des organes au cœur",
            "Je conduis le sang du cœur aux organes",
            "Je conduis le sang du ventricule gauche aux organes",
            "Je conduis le sang des organes à l’oreillette droite",
            "Je conduis le sang du ventricule droit aux poumons",
            "Je conduis le sang des poumons à l’oreillette droite",
            "Je suis un durcissement de la paroi des artères dû à un dépôt de graisses",
            "Je suis une inflammation de la paroi des artères",
            "Je suis une inflammation de la paroi des veines",
            "Je suis un écoulement de sang hors des vaisseaux sanguin",






    };



    private String nChoice [][] = {

            {"la valve auriculo-ventriculaire", "la valvule auriculo-ventriculaire",  "l’alvéole" , "la trachée artère"},
            {"l’oreillette gauche" ,  "l’oreillette droite" , "la systole auriculaire" , "le poumon"},
            {"la systole ventriculaire" , "l’orbite" , "la systole auriculaire" , "le poumon"},
            {"la systole" , "la poitrine" , "la diastole" , "la dyastole"},
            {"la tension artérielle" , "la pression artérielle" , "le vaisseau sanguin" , "artérite"},
            {"la super tension artérielle" , "la crise cardiaque" , "la surtension artérielle" , "l’hypertension artérielle"},
            {"l’hypotension artérielle", "l’hibernation",  "la sous tension artérielle" , "la basse tension"},
            {"une vaine" , "un vin" , "une alvéole" , "une veine"},
            {"une veine" , "une athlète" , "une artère" , "une artérite"},
            {"l’artère aorte" , "l’artère pulmonaire" , "la veine pulmonaire" , "la veine cave"},
            {"la veine pulmonaire" , "les veines caves" , "la vésicule pulmonaire" , "l’artère"},
            {"l’artère aorte" , "la veine cave" , "la veine pulmonaire" , "l’artère pulmonaire"},
            {"la veine", "la veine cave",  "les vaisseaux pulmonaire" , "les veines pulmonaires"},
            {"l’artérite" , "l’artériosclérose" , "l’artéfact" , "l’haltérophilie"},
            {"la veinite" , "la presbytie" , "l’Archamps" , "l’artérite"},
            {"la chaux" , "le vinyle" , "la veinite" , "la phlébite"},
            {"l’hémorragie" , "l’hémoglobine" , "l’hématie" , "l’anémie"},







    };




    private String correctReponse [] = {

            "la valvule auriculo-ventriculaire" , "la systole auriculaire" , "la systole ventriculaire" , "la diastole" , "la tension artérielle" , "l’hypertension artérielle" , "l’hypotension artérielle" , "une veine" , "une artère" , "l’artère aorte" , "les veines caves" , "l’artère pulmonaire" , "les veines pulmonaires" , "l’artériosclérose" , "l’artérite" , "la phlébite" , "l’hémorragie"

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

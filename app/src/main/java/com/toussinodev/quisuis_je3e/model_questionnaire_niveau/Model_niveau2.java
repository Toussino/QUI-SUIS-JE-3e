package com.toussinodev.quisuis_je3e.model_questionnaire_niveau;

public class Model_niveau2 {




    public String myQuestion [] = {



            "Je suis le lieu de rencontre entre le spermatozoïde et l’ovule",
            "Je suis le traitement d’une maladie",
            "Je suis l’addiction (ou la dépendance) à la consommation d’alcool",
            "Je suis l’unité anatomique et physiologique de l’organisme",
            "Je suis responsable de la couleur rouge du muscle",
            "Je suis la partie du système nerveux logé dans le canal rachidien",
            "Je suis la glande qui secrète les larmes",
            "En présence d’empois d’amidon, je donne une coloration bleue intense",
            "J’interviens dans le transport de l’oxygène et du gaz carbonique",
            "Je suis la phase de contraction des oreillettes",
            "Je suis le seul os mobile de la tête",
            "Je suis une exagération de l’élasticité du muscle",
            "Je suis la membrane qui est au contact de l’encéphale et de la moelle épinière",
            "Je suis la membrane protectrice de l’œil",
            "Je suis constitué de plusieurs aliments simples",
            "Je suis une rupture des fibres musculaire",
            "Je surviens sur le muscle qui ne travaille pas",






    };



    private String nChoice [][] = {

            {"le tiers inferieur de la trompe", "le tiers supérieur de la trompe",  "l’ovaire" , "la case thoracique"},
            {"le traitement" ,  "la posologie" , "la thérapie" , "le médicament"},
            {"l’alcoolisme" , "l’alcoolémie" , "l’alcoolique" , "l’alcool"},
            {"la cellulose" , "la cellule" , "l ’anatomie" , "la molécule"},
            {"le globule rouge" , "le globulin" , "la myoglobine" , "la globine"},
            {"la moelle épinière" , "l ’épine dorsale" , "moelle jaune" , "la moelle rouge"},
            {"la glande lacrimale", "la glande lacrymale",  "la glande de larmoiement" , "la tyroïde"},
            {"l’eau iodée" , "l ’eau anodisée" , "sulfate de soude" , "l ’ammoniaque"},
            {"le globulin" , "le globule roux" , "le globule blanc" , "l ’hémoglobine"},
            {"l’oreillette gauche" , "l’oreillette droite" , "la systole auriculaire" , "le poumon"},
            {"le maxillaire supérieur" , "le maxillaire inferieur" , "le scrotum" , "le fémur"},
            {"l’élongation" , "l’étirement" , "l’atrophie musculaire" , "la crampe"},
            {"le cerveau", "le placenta",  "la moelle épinière" , "pie mère"},
            {"la sclérotique" , "la membrane hyaloïde" , "le corps vitre" , "la cornée"},
            {"un aliment composite" , "un aliment décomposé" , "un aliment multiple" , "un aliment compose"},
            {"la déchirure musculaire" , "le sarclage" , "la crampe" , "le claquage"},
            {"l’atrophie musculaire" , "la métamorphose" , "la contraction musculaire" , "le repos musculaire"},




    };



    private String correctReponse [] = {

            "le tiers supérieur de la trompe" , "la thérapie" , "l’alcoolisme" , "la cellule" , "la myoglobine" , "la moelle épinière" , "la glande lacrymale" , "l’eau iodée" , "l ’hémoglobine" , "la systole auriculaire" , "le maxillaire inferieur" , "l’élongation" , "pie mère" , "la sclérotique" , "un aliment compose" , "le claquage" , "l’atrophie musculaire"

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

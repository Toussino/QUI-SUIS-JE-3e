package com.toussinodev.quisuis_je3e.model_questionnaire_niveau;

public class Model_niveau4 {




    public String myQuestion [] = {



            "Je résulte de la combinaison entre l’hémoglobine et le gaz carbonique",
            "Je suis la phase de repos du cœur",
            "Je suis le lieu où se déroule l’échange gazeux entre le sang et l’air",
            "Je suis la présence de sang dans les urines",
            "Je suis la partie terminale du pénis et je protège le gland",
            "Je résulte de la fusion entre le sperme et l’ovule",
            "Je suis une maladie infectieuse qui atteint en même temps un grand nombre de personnes",
            "Je suis une substance d’origine naturelle ou synthétique qui agit sur l’organisme en modifiant ses sensations ou son comportement",
            "Je suis la première vertèbre cervicale",
            "Je suis la membrane nourricière de système nerveux",
            "Je suis la capacité de l’œil à voir distinctement les objets rapprochés",
            "Je suis une maladie provoquée par une carence en vitamine",
            "Je suis le phénomène par lequel les leucocytes traversent les parois des capillaires",
            "Je suis la pression exercée par le sang sur la paroi des artères",
            "Je suis l’ensemble formé par les voies respiratoire et les poumons",
            "Je suis l’organe (glande) reproductrice sécrétant les hormones mâles",
            "Je suis le lieu de développement du fœtus au cours de la grossesse",
            "Je suis la manifestation clinique d’une maladie",
            "Je suis le temps compris entre l’introduction d’un microbe dans l’organisme et l’apparition des premiers symptômes",
            "Je suis la deuxième vertèbre cervicale",
            "Je suis le liquide contenu dans l’espace situé entre l’arachnoïde et la pie mère",
            "je suis responsable de l’accommodation de l’œil",
            "Ma carence entraine une baisse de la vision crépusculaire et un arrêt de la croissance",
            "Je suis le phénomène par lequel les globules blancs capturent et digèrent les microbes",
            "Je suis une élévation de la tension artérielle au-dessus de 14",
            "Je suis une bouillie blanchâtre résultant de la digestion",
            "Je suis l’altération progressive du tissu dur de la dent",





    };



    private String nChoice [][] = {

            {"la gazéification", "la carbohémoglobine",  "la carbonisation" , "l ’homogénéisation"},
            {"la systole" ,  "la poitrine" , "la diastole" , "la dyastole"},
            {"l’artère pulmonaire" , "la vésicule pulmonaire" , "l’alvéole pulmonaire" , "l’artère aorte"},
            {"l’hématome" , "l’hématurie" , "l’hémorragie" , "l’hémorroïde"},
            {"la capsule" , "le prépuce" , "la puce" , "l’enveloppe"},
            {"l’œuf ou zygote" , "le fœtus" , "l’ambrions" , "l’ovulation"},
            {"une pandémie", "une épidémie",  "une endémie" , "une bactérie"},
            {"une drogue" , "un droguiste" , "une droguerie" , "le cannabis"},
            {"la vertèbre lombaire" , "l ’axis" , "le péroné" , "l ’atlas"},
            {"la dure mère" , "la pie mère" , "la moelle épinière" , "le liquide céphalorachidien"},
            {"le gonflement" , "l ’accoutumance" , "le zoom" , "l ’accommodation"},
            {"l'albumine" , "l’alcaline" , "l’alvéole" , "une avitaminose"},
            {"la diapédèse", "la perforation",  "la pénétration" , "le diaporamas"},
            {"la tension artérielle", "la pression artérielle",  "le vaisseau sanguin" , "artérite"},
            {"l’appareil digestif" ,  "l’appareil urinaire" , "l’appareil circulatoire" , "l’appareil respiratoire"},
            {"le testicule" , "les hormones" , "le testostérone" , "le sang"},
            {"le col" , "la colle" , "l’utérus" , "le collet"},
            {"le signe" , "le virus" , "la manipulation" , "le symptôme"},
            {"l’incubation" , "la gestation" , "la fécondation" , "l’accouchement"},
            {"le cervidé", "l’axis",  "l’axiome" , "la maxime"},
            {"le liquide cérébro-rachidien" , "le liquide céphalo-rachidien" , "le liquide céphalo-spinal" , "la glande cervicale"},
            {"les cristaux" , "le cristallin" , "les cônes" , "les batônnets"},
            {"la vitamine A" , "la vitamine B" , "la vitamine C" , "la vitamine D"},
            {"le bulbe rachidien" , "la phagocytose" , "la digestion" , "l ’ingestion"},
            {"la super tension artérielle" , "la crise cardiaque" , "la surtension artérielle" , "l’hypertension artérielle"},
            {"la matière fécale" , "le chyle" , "le cil" , "la cime"},
            {"la carie dentaire" , "l ’hypersensibilité" , "le bruxisme" , "la tendinite"},





    };



    private String correctReponse [] = {

            "la carbohémoglobine" , "la diastole" , "l’alvéole pulmonaire" , "l’hématurie" , "le prépuce" , "l’œuf ou zygote" , "une épidémie" , "une drogue" , "l ’atlas" , "la pie mère" , "l ’accommodation" , "une avitaminose" , "la diapédèse" , "la tension artérielle" , "l’appareil respiratoire" , "le testicule" , "l’utérus" , "le symptôme" , "l’incubation" , "l’axis" , "le liquide céphalo-rachidien" , "le cristallin" , "la vitamine A" , "la phagocytose" , "l’hypertension artérielle" , "le chyle" , "la carie dentaire"

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

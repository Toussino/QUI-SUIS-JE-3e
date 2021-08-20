package com.toussinodev.quisuis_je3e;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reviser extends AppCompatActivity {

    private Button test1;
    private Button muscle;
    private Button system_nerveux;
    private Button oeil;
    private Button aliment;
    private Button sang;
    private Button circulatoire;
    private Button respiratoire;
    private Button urinaire;
    private Button caracteristique;
    private Button maternite;
    private Button maladie;
    private Button fleaux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviser);


        test1= findViewById(R.id.test1);
        muscle = findViewById(R.id.muscle);
        system_nerveux = findViewById(R.id.system_nerveux);
        oeil = findViewById(R.id.oeil);
        aliment = findViewById(R.id.aliment);
        sang = findViewById(R.id.sang);
        circulatoire = findViewById(R.id.circulatoire);
        respiratoire = findViewById(R.id.respiratoire);
        urinaire = findViewById(R.id.urinaire);
        caracteristique = findViewById(R.id.caracteristique);
        maternite = findViewById(R.id.maternite);
        maladie = findViewById(R.id.maladie);
        fleaux = findViewById(R.id.fleaux);







        test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Squelette_activiter.class);
                startActivity(intent);
            }
        });



        muscle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Activiter_muscle.class);
                startActivity(intent);
            }
        });



        system_nerveux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Activiter_nerveux.class);
                startActivity(intent);
            }
        });



        oeil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Activiter_oeil.class);
                startActivity(intent);
            }
        });


        aliment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Activiter_aliment.class);
                startActivity(intent);
            }
        });


        sang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Activiter_sang.class);
                startActivity(intent);
            }
        });



        circulatoire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Activiter_circulatoire.class);
                startActivity(intent);
            }
        });


        respiratoire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Activiter_respiratoire.class);
                startActivity(intent);
            }
        });



        urinaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Activiter_urinaire.class);
                startActivity(intent);
            }
        });



        caracteristique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Activiter_caracteristique.class);
                startActivity(intent);
            }
        });



        maternite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Activiter_maternite.class);
                startActivity(intent);
            }
        });



        maladie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Activiter_maladie.class);
                startActivity(intent);
            }
        });



        fleaux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Activiter_fleaux.class);
                startActivity(intent);
            }
        });


    }
}

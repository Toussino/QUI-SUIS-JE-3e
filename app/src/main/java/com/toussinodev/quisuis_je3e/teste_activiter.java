package com.toussinodev.quisuis_je3e;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.toussinodev.quisuis_je3e.folder_niveau.Niveau1_activiter;
import com.toussinodev.quisuis_je3e.folder_niveau.Niveau2_activiter;
import com.toussinodev.quisuis_je3e.folder_niveau.Niveau3_activiter;
import com.toussinodev.quisuis_je3e.folder_niveau.Niveau4_activiter;
import com.toussinodev.quisuis_je3e.folder_niveau.Niveau5_activiter;
import com.toussinodev.quisuis_je3e.folder_niveau.Niveau6_activiter;
import com.toussinodev.quisuis_je3e.folder_niveau.Niveau7_activiter;

public class teste_activiter extends AppCompatActivity {

    private Button niveau1;
    private Button niveau2;
    private Button niveau3;
    private Button niveau4;
    private Button niveau5;
    private Button niveau6;
    private Button niveau7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste_activiter);

        niveau1 = findViewById(R.id.niveau1);
        niveau1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Niveau1_activiter.class);
                startActivity(intent);
            }
        });



        // niveau 2

        niveau2 = findViewById(R.id.niveau2);
        niveau2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Niveau2_activiter.class);
                startActivity(intent);
            }
        });



        // niveau3

        niveau3 = findViewById(R.id.niveau3);
        niveau3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Niveau3_activiter.class);
                startActivity(intent);
            }
        });



        // niveau4

        niveau4 = findViewById(R.id.niveau4);
        niveau4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Niveau4_activiter.class);
                startActivity(intent);
            }
        });


        // niveau5

        niveau5 = findViewById(R.id.niveau5);
        niveau5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Niveau5_activiter.class);
                startActivity(intent);
            }
        });



        // niveau6

        niveau6 = findViewById(R.id.niveau6);
        niveau6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Niveau6_activiter.class);
                startActivity(intent);
            }
        });



        // niveau7


        niveau7 = findViewById(R.id.niveau7);
        niveau7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Niveau7_activiter.class);
                startActivity(intent);
            }
        });



    }
}

package com.toussinodev.quisuis_je3e;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class SplashCrine extends AppCompatActivity implements UpdateHelper.onUpdateCheckListener{

    private AdView mAdView;
    private Button revise1;
    private Button noter;
    private Button teste;
    private Button astuce;
    private Button propos;
    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_crine);

        UpdateHelper.with(this)
                .onUpdateCheck(this)
                .check();



        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-4368197516288969/3883773028");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());



        //Publicer bannierre admob


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-4368197516288969/2094573856");


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);




        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });


    // Demarrage de l activiter REVISER


        revise1 = findViewById(R.id.revise1);
        teste = findViewById(R.id.teste);
        revise1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Reviser.class);
                startActivity(intent);
            }
        });




  noter = findViewById(R.id.noter);
  noter.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

          try {
              Uri uri = Uri.parse("market://details?id=" +getPackageName());
              Intent intent = new Intent(Intent.ACTION_VIEW,uri);
              intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
              startActivity(intent);
          }catch (ActivityNotFoundException e){
              Uri uri = Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName());
              Intent intent = new Intent(Intent.ACTION_VIEW,uri);
              intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
              startActivity(intent);
          }


      }
  });



  teste.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          Intent intent = new Intent(getApplicationContext(), teste_activiter.class);
          startActivity(intent);
      }
  });




        astuce = findViewById(R.id.astuce);
        astuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Intent intent = new Intent(getApplicationContext(), Activiter_astuce.class);
                    startActivity(intent);
                }


                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        Intent intent = new Intent(getApplicationContext(), Activiter_astuce.class);
                        startActivity(intent);
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }

                });




            }






        });




        propos = findViewById(R.id.propos);
        propos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activiter_propos.class);
                startActivity(intent);
            }
        });











    }


    @Override
    public void onUpdateCheckListener(String urlApp) {

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Nouvelle version disponible!");
        alertDialog.setCancelable(false);
        alertDialog.setMessage("Veuillez mettre à jours votre application pour bénéficier des nouvelles améliorations.");
        alertDialog.setPositiveButton("Mettre à jours", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //app url
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("market://details?id=com.example.quisuis_je3e"));
                startActivity(intent);

            }
        }).setNegativeButton("Plus tard", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).create();
        alertDialog.show();



    }
}

package com.example.hm2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PruebaMainActivity extends AppCompatActivity {

    ImageButton infoImageButton;
    ImageButton infoImageButtonResources;
    ImageButton infoImageButtonSurvey;
    ImageButton infoImageButtonResults;
    ImageButton infoImageButtonMic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba_main);

        infoImageButton = (ImageButton) findViewById(R.id.buttonInfo);
        infoImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentLoadActivityInfo = new Intent(PruebaMainActivity.this,PersonalInfo.class);
                startActivity(intentLoadActivityInfo);
            }
            });

        infoImageButtonResources = (ImageButton) findViewById(R.id.buttonResources);
        infoImageButtonResources.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentLoadActivityInfo = new Intent(PruebaMainActivity.this,Resources.class);
                startActivity(intentLoadActivityInfo);
            }
        });

        infoImageButtonSurvey = (ImageButton) findViewById(R.id.buttonSurvey);
        infoImageButtonSurvey.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentLoadActivityInfo = new Intent(PruebaMainActivity.this,Survey.class);
                startActivity(intentLoadActivityInfo);
            }
        });

        infoImageButtonResults = (ImageButton) findViewById(R.id.buttonResults);
        infoImageButtonResults.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentLoadActivityInfo = new Intent(PruebaMainActivity.this,Results.class);
                startActivity(intentLoadActivityInfo);
            }
        });

        infoImageButtonMic = (ImageButton) findViewById(R.id.imageMenu);
        infoImageButtonMic.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentLoadActivityInfo = new Intent(PruebaMainActivity.this,VoiceRecognition.class);
                startActivity(intentLoadActivityInfo);
            }
        });
    }
}
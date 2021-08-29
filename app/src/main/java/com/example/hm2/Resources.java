package com.example.hm2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Resources extends AppCompatActivity {

    ImageButton infoImageButtonHome;
    Button infoImageButtonSubmitR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);

        infoImageButtonHome = (ImageButton) findViewById(R.id.imageButtonHome);
        infoImageButtonHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentLoadActivityInfo = new Intent(Resources.this,PruebaMainActivity.class);
                startActivity(intentLoadActivityInfo);
            }
        });

        infoImageButtonSubmitR = (Button) findViewById(R.id.buttonSubmitR);
        infoImageButtonSubmitR.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentLoadActivityInfo = new Intent(Resources.this,PruebaMainActivity.class);
                startActivity(intentLoadActivityInfo);
            }
        });
    }
}
package com.example.hm2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PersonalInfo extends AppCompatActivity {

    ImageButton infoImageButtonHome;
    Button infoImageButtonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);

        infoImageButtonHome = (ImageButton) findViewById(R.id.imageButtonHome);
        infoImageButtonHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentLoadActivityInfo = new Intent(PersonalInfo.this,PruebaMainActivity.class);
                startActivity(intentLoadActivityInfo);
            }
        });

        infoImageButtonSubmit = (Button) findViewById(R.id.buttonSubmit);
        infoImageButtonSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentLoadActivityInfo = new Intent(PersonalInfo.this,PruebaMainActivity.class);
                startActivity(intentLoadActivityInfo);
            }
        });
    }
}
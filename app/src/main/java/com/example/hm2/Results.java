package com.example.hm2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Results extends AppCompatActivity {

    ImageButton infoImageButtonHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        infoImageButtonHome = (ImageButton) findViewById(R.id.imageButtonHome);
        infoImageButtonHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentLoadActivityInfo = new Intent(Results.this,PruebaMainActivity.class);
                startActivity(intentLoadActivityInfo);
            }
        });
    }
}
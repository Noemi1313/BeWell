package com.example.hm2;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class VoiceRecognition extends AppCompatActivity {

    ImageButton buttonSpeech;
    private static final int RECOGNIZER_RESULT = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voice_recognition);

        buttonSpeech = findViewById(R.id.buttonMicro);

        buttonSpeech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent speechIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                speechIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                speechIntent.putExtra(RecognizerIntent.EXTRA_PROMPT, "How are you feeling?");
                startActivityForResult(speechIntent, RECOGNIZER_RESULT);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if (requestCode == RECOGNIZER_RESULT && resultCode == RESULT_OK);
        {
            if (data != null) {
                ArrayList<String> matches = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                TextView textView = findViewById(R.id.textView);
                textView.setText(matches.get(0).toString());

                switchActivities();
            }
        }

        super.onActivityResult(requestCode, resultCode, data);
    }

    private void switchActivities() {
        Intent switchActivityIntent = new Intent(this, PruebaMainActivity.class);
        startActivity(switchActivityIntent);
    }

}


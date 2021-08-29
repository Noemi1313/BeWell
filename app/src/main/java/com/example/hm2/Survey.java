package com.example.hm2;
/* Se necesitan todos los imports mostrados aqui */
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hm2.databinding.ActivityMainBinding;

import java.util.Random;

/* En esta public class se agrego "implements View.OnClickListener" */
public class Survey extends AppCompatActivity implements View.OnClickListener{

    private ActivityMainBinding binding;
    /* Aqui se declaran los botones a usar, son de tipo button*/
    Button btn_one, btn_two, btn_three, btn_four;
    TextView tv_question;

    private Question question = new Question(); // declaracion de la clase Question

    private String answer;
    private int questionLength = question.questions.length;// el size del array de preguntas
    private int c, c1, c2, c3, c4 = 0; //Counters para las graficas

    Random random; // funcion para generar numeros random

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);


        random = new Random();// Funcion para generar un random

        // Seccion donde se declaran las variables de los botones para que funcion al presionarlos
        btn_one = (Button) findViewById(R.id.btn_one);
        btn_one.setOnClickListener(this);
        btn_two = (Button) findViewById(R.id.btn_two);
        btn_two.setOnClickListener(this);
        btn_three = (Button) findViewById(R.id.btn_three);
        btn_three.setOnClickListener(this);
        btn_four = (Button) findViewById(R.id.btn_four);
        btn_four.setOnClickListener(this);

        tv_question = (TextView) findViewById(R.id.tv_question);

        //NextQuestion(random.nextInt(questionLength));

    }

    // En esta seccion se hace el case con el cual se compara y toma accion en base a la respuesta del usuario
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_one:

                c1 += 1;
                c += 1;
                NextQuestion(c - 1);
                break;

            case R.id.btn_two:

                c2 += 1;
                c += 1;
                NextQuestion(c - 1);
                break;

            case R.id.btn_three:

                c3 += 1;
                c += 1;
                NextQuestion(c - 1);
                break;

            case R.id.btn_four:

                c4 += 1;
                c += 1;
                NextQuestion(c - 1);
                break;
        }
    }

    // Este "Game Over" permite repetir la survey o salir de la app al finalizar la survey
    private void GameOver() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Survey.this);
        alertDialogBuilder
                .setMessage("End of survey")
                .setCancelable(false)
                .setPositiveButton("New entry", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    }
                })
                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.exit(0);
                    }
                });
        alertDialogBuilder.show();

    }
    // Esta funcion sirve para cambiar de pregunta cada vez que se selecciona una respuesta
    private void NextQuestion(int num) {

        if (num >= 3) {
            c = 0;
            GameOver();
        }else{
            tv_question.setText(question.getQuestion(num));
            btn_one.setText(question.getchoice1(num));
            btn_two.setText(question.getchoice2(num));
            btn_three.setText(question.getchoice3(num));
            btn_four.setText(question.getchoice4(num));
        }
    }
}
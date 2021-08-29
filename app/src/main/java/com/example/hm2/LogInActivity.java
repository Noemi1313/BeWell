package com.example.hm2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogInActivity extends AppCompatActivity {

    EditText username, password;
    Button btnLogin;

    String correct_username = "admin";
    String correct_password = "123";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        Button changeActivityBTN = findViewById(R.id.buttonRegister);
        Button changeActivityMain = findViewById(R.id.buttonLogIn);
        changeActivityBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeActivity();
            }
        });

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnLogin = findViewById(R.id.buttonLogIn);

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // validate inputs
                if(TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(password.getText().toString())){
                    Toast.makeText(LogInActivity.this,"Empty data provided",Toast.LENGTH_LONG).show();
                }else if(username.getText().toString().equals(correct_username)){
                    // check password
                    if(password.getText().toString().equals(correct_password)){
                        //Toast.makeText(LogInActivity.this,"Succesful LogIn",Toast.LENGTH_LONG).show();
                        changeActivityMain.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                changeActivityMain();
                            }
                        });

                    }
                    else{
                        Toast.makeText(LogInActivity.this,"Invalid Username/Password",Toast.LENGTH_LONG).show();
                    }
                }else {
                    Toast.makeText(LogInActivity.this, "Invalid Username/Password", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void changeActivity() {
        Intent intent = new Intent(this,Register.class);
        startActivity(intent);
    }
    private void changeActivityMain() {
        Intent intent = new Intent(this,PruebaMainActivity.class);
        startActivity(intent);
    }
}
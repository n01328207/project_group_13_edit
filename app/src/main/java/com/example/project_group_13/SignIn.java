package com.example.project_group_13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {

    TextView direct12;
    Button direct1234;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        direct1234 = (Button) findViewById(R.id.signinne);
        direct1234.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn.this,GreetingScreen.class);
                startActivity(intent);
            }
        });

        direct12 = (TextView) findViewById(R.id.forgotpassword);
        direct12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn.this,ForgotPassword.class);
                startActivity(intent);
            }
        });
    }
}
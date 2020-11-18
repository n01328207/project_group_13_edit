package com.example.project_group_13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpScreen1 extends AppCompatActivity {

    Button signvao0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_screen1);

        signvao0 = (Button) findViewById(R.id.tieptucsignup1);
        signvao0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpScreen1.this,SignUpScreen2.class);
                startActivity(intent);
            }
        });
    }
}
package com.example.project_group_13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Registration extends AppCompatActivity {

    public ImageView goTypes;
    public ImageView goPayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        goTypes = (ImageView) findViewById(R.id.circleMid1);
        goTypes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Registration.this,Types.class);
                startActivity(intent);
            }
        });

        goPayment = (ImageView) findViewById(R.id.circleRight1);
        goPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Registration.this,Payment.class);
                startActivity(intent);
            }
        });
    }
}
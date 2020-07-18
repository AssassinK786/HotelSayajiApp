package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcomeActivity extends AppCompatActivity {

    private Button login1;
    private Button login2;
    private Button login3;
    private Button login4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        login1 = findViewById(R.id.btn_login1);
        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(welcomeActivity.this, RoomActivity.class);
                startActivity(intent);
            }
        });


        login2 = findViewById(R.id.btn_login2);
        login2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(welcomeActivity.this, restaurantActivity.class);
                startActivity(intent);
            }
        });


        login3 = findViewById(R.id.btn_login3);
        login3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(welcomeActivity.this, lesiureActivity.class);
                startActivity(intent);

            }
        });


        login4 = findViewById(R.id.btn_login4);
        login4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(welcomeActivity.this, BillActivity.class);
                startActivity(intent);
            }
        });
    }

}
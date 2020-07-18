package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RoomActivity extends AppCompatActivity {

    private Button room1;
    private Button room2;
    private Button room3;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);


        room1 = findViewById(R.id.btn_room1);
        room1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RoomActivity.this, roomActivity1.class);
                startActivity(intent);
            }
        });


        room2 = findViewById(R.id.btn_room2);
        room2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RoomActivity.this, roomActivity2.class);
                startActivity(intent);
            }
        });


        room3 = findViewById(R.id.btn_room3);
        room3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RoomActivity.this, roomActivity3.class);
                startActivity(intent);

            }
        });

    }
}
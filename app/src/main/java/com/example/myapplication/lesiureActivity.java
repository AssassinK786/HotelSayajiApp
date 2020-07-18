package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class lesiureActivity extends AppCompatActivity {

    private EditText num1;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button Amt;
    private TextView Ans;
    int px =0,tt=0,go=0,pc=0;
    int subtotal5 = 0;
    static int total5 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesiure);
        num1 = findViewById(R.id.ET_num1);
        btn1 = findViewById(R.id.btnl1);
        btn2 = findViewById(R.id.btnl2);
        btn3 = findViewById(R.id.btnl3);
        btn4 = findViewById(R.id.btnl4);
        Amt = findViewById(R.id.Amtbtn);
        Ans = findViewById(R.id.txt_ans);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().toString().length() == 0){
                    num1.setText("0");
                }
                int n1 = Integer.parseInt(num1.getText().toString());
                int px = n1 * 70;
                subtotal5 = px;
                Ans.setText(String.valueOf(subtotal5));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().toString().length() == 0){
                    num1.setText("0");
                }
                int n1 = Integer.parseInt(num1.getText().toString());
                int tt = n1 * 50;
                subtotal5 = tt;
                Ans.setText(String.valueOf(subtotal5));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().toString().length() == 0){
                    num1.setText("0");
                }
                int n1 = Integer.parseInt(num1.getText().toString());
                int pc = n1 * 60;
                subtotal5 = pc;
                   Ans.setText(String.valueOf(subtotal5));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().toString().length() == 0){
                    num1.setText("0");
                }
                int n1 = Integer.parseInt(num1.getText().toString());
                int go = n1 * 120;
                subtotal5 = go;
                Ans.setText(String.valueOf(subtotal5));
            }
        });

        Amt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total5 = total5 + subtotal5;
                subtotal5 = 0;
                Ans.setText(String.valueOf(total5));
                BillActivity.all_total = roomActivity1.total1 +roomActivity2.total2 +roomActivity3.total3 + restaurantActivity.total4 + lesiureActivity.total5;
            }
        });

    }
}
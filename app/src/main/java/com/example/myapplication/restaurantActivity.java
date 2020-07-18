package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.DecimalFormat;
import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class restaurantActivity extends AppCompatActivity {

    private EditText num1;
    private Button btnvg;
    private Button btnnvg;
    private Button btnmc;
    private Button btnjc;
    private Button Amt;
    private TextView Ans;
    int vg = 0, nvg = 0, jc = 0, mc = 0;
    int subtotal4 = 0;
    static int total4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        num1 = findViewById(R.id.ET_num2);
        btnvg = findViewById(R.id.vg);
        btnnvg = findViewById(R.id.nvg);
        btnmc = findViewById(R.id.mc);
        btnjc = findViewById(R.id.jc);
        Amt = findViewById(R.id.restt);
        Ans = findViewById(R.id.txt_rest);
        btnvg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().toString().length() == 0){
                    num1.setText("0");
                }
                int n1 = Integer.parseInt(num1.getText().toString());
                int vg = n1 * 250;
                subtotal4 = vg;
                Ans.setText(String.valueOf(subtotal4));
            }
        });

        btnnvg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().toString().length() == 0){
                    num1.setText("0");
                }
                int n1 = Integer.parseInt(num1.getText().toString());
                int nvg = n1 * 450;
                subtotal4 = nvg;
                Ans.setText(String.valueOf(subtotal4));
            }
        });

        btnmc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().toString().length() == 0){
                    num1.setText("0");
                }
                int n1 = Integer.parseInt(num1.getText().toString());
                int mc = n1 * 350;
                subtotal4 = mc;
                Ans.setText(String.valueOf(subtotal4));
            }
        });

        btnjc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().toString().length() == 0){
                    num1.setText("0");
                }
                int n1 = Integer.parseInt(num1.getText().toString());
                int jc = n1 * 275;
                subtotal4 = jc;
                Ans.setText(String.valueOf(subtotal4));
            }
        });

        Amt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total4 = total4 + subtotal4;
                subtotal4 = 0;
                Ans.setText(String.valueOf(total4));

                
            }
        });

    }
}
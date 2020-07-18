package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class roomActivity3 extends AppCompatActivity {

    private EditText numexe;
    private Button btnexe;
    private Button Amt3;
    private TextView Ans;

    int taxamt=0,amt=0;
    static int total3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room3);
        numexe = findViewById(R.id.ET_room3);
        btnexe = findViewById(R.id.btn_exe);
        Amt3 = findViewById(R.id.Amtbtn);
        Ans = findViewById(R.id.txt_ans3);

        btnexe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(numexe.getText().toString().length() == 0){
                    numexe.setText("0");
                }
                int n1 = Integer.parseInt(numexe.getText().toString());
                int amt = n1 * 10000;
                taxamt = (18 * amt)/100;
                total3 = amt + taxamt;
                Ans.setText(String.valueOf(total3));
                BillActivity.all_total = roomActivity1.total1 +roomActivity2.total2 +roomActivity3.total3 + restaurantActivity.total4 + lesiureActivity.total5;

            }
        });
    }
}
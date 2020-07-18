package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class roomActivity1 extends AppCompatActivity {

    private EditText numstd;
    private Button btnstd;
    private Button Amt;
    private TextView Ans;

    int taxamt=0,amt=0;
    static int total1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room1);

        numstd = findViewById(R.id.ET_room1);
        btnstd = findViewById(R.id.btn_std);
        Amt = findViewById(R.id.Amtbtn);
        Ans = findViewById(R.id.txt_ans1);

        btnstd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(numstd.getText().toString().length() == 0){
                    numstd.setText("0");
               }
                int n1 = Integer.parseInt(numstd.getText().toString());
                int amt = n1 * 5000;
                taxamt = (18 * amt)/100;
                total1 = amt + taxamt;
                Ans.setText(String.valueOf(total1));
                BillActivity.all_total = roomActivity1.total1 +roomActivity2.total2 +roomActivity3.total3 + restaurantActivity.total4 + lesiureActivity.total5;
            }
        });
    }
}
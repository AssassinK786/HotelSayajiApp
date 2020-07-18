package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class roomActivity2 extends AppCompatActivity {

    private EditText numdex;
    private Button btndex;
    private Button Amt2;
    private TextView Ans;

    int taxamt=0,amt=0;
    static int total2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room2);

        numdex = findViewById(R.id.ET_room2);
        btndex = findViewById(R.id.btn_dex);
        Amt2 = findViewById(R.id.Amtbtn);
        Ans = findViewById(R.id.txt_ans2);

        btndex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(numdex.getText().toString().length() == 0){
                    numdex.setText("0");
                }
                int n1 = Integer.parseInt(numdex.getText().toString());
                int amt = n1 * 7500;
                taxamt = (18 * amt)/100;
                total2 = amt + taxamt;
                Ans.setText(String.valueOf(total2));
                BillActivity.all_total = roomActivity1.total1 +roomActivity2.total2 +roomActivity3.total3 + restaurantActivity.total4 + lesiureActivity.total5;
                
            }
        });
    }
}
package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.icu.text.DecimalFormat;
import android.icu.text.NumberFormat;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

@RequiresApi(api = Build.VERSION_CODES.N)
public class BillActivity extends AppCompatActivity {
    BillActivity a = this;
    static int all_total;
    Object oo;
    String room_string = "";
    String lesiure_string = "";
    String restarant_string = "";
    String display_result = "";

    NumberFormat formatter = new DecimalFormat("##,###");
    public String S;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);
        show_Order();
        tot_v();
        oo = this;
    }

    public void show_Order() {
        if (roomActivity1.total1 > 0) {
            room_string = room_string + "Standard Class-" + String.valueOf(roomActivity1.total1) ;
        }

        if (roomActivity2.total2 > 0) {
            if (room_string != ""){
                room_string = room_string + "\n";
            }
            room_string = room_string + "Deluxe Class-" + String.valueOf(roomActivity2.total2) ;
        }

        if (roomActivity3.total3 > 0) {
            if (room_string != ""){
                room_string = room_string + "\n";
            }
            room_string = room_string + "Executive Class-" + String.valueOf(roomActivity3.total3) ;
        }

        if (restaurantActivity.total4 > 0) {
            restarant_string = restarant_string + "Restaurant Bill" + String.valueOf(restaurantActivity.total4) ;
        }
        if (lesiureActivity.total5 > 0) {
            lesiure_string = lesiure_string + "Lesiure Bill" + String.valueOf(lesiureActivity.total5) ;
        }
    }

    public void tot_v() {

        if (room_string!=""){
            display_result = room_string + "\n";
        }

        if (restarant_string !="") {
            display_result = room_string + restarant_string + "\n";
        }
        if (lesiure_string !="") {
            display_result = room_string + lesiure_string + "\n";
        }


        all_total = roomActivity1.total1 +roomActivity2.total2 +roomActivity3.total3 + restaurantActivity.total4 + lesiureActivity.total5;;

        if (display_result !="") {
            display_result = display_result + "\n ===============\n Total Price : ₹." + formatter.format(all_total) + "\n ===============\n";
        } else {
            display_result = "===============\n Total Price : ₹." + formatter.format(all_total) + "===============\n";
        }


        TextView tv = (TextView) findViewById(R.id.bill);
            tv.setText(display_result);
    }
}
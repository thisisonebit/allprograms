package com.mandem.allprograms;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;

import androidx.appcompat.app.AppCompatActivity;

public class prog_4_AlertBox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_alertbox);
        Button b = findViewById(R.id.btn);
        b.setOnClickListener(v->{
            AlertDialog.Builder builder = new AlertDialog.Builder(prog_4_AlertBox.this);
            builder.setCancelable(true);
            builder.setTitle("This an alert");
            builder.setMessage("AYO WHAT");
            builder.setNegativeButton("Cancel",null);
            builder.setPositiveButton("Ok",null);
            AlertDialog di = builder.create();
            di.show();
        });
    }
}

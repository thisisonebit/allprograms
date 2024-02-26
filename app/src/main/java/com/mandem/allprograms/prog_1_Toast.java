package com.mandem.allprograms;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class prog_1_Toast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_toast);
        Toast.makeText(this,"Hello World",Toast.LENGTH_SHORT);
    }
}

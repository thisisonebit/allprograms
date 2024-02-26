package com.mandem.allprograms;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AppCompatActivity;


public class prog_7_SpinItems extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7_spinitems);
        Spinner sr = findViewById(R.id.spinnerProg);
        String[] spinArray = new String[]{"Array1","Array2","Array3","Array4"};
       ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,spinArray);
       sr.setAdapter(adapter);
    }
}

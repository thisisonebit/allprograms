package com.mandem.allprograms;

import android.os.Bundle;
import android.widget.Toast;
import android.widget.Button;
import android.widget.CheckBox;
import androidx.appcompat.app.AppCompatActivity;

public class prog_9_CheckBox extends AppCompatActivity{
    String summary;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_9_checkbox);
        CheckBox ra = findViewById(R.id.raggedCB);
        CheckBox ri = findViewById(R.id.riggedCB);
        CheckBox ro = findViewById(R.id.roggedCB);
        Button b = findViewById(R.id.cbButton);
        b.setOnClickListener(v->{
            if (ri.isChecked()){
                summary+= "rigged";
            }
            if (ra.isChecked()){
                summary+= "ragged";
            }
            if (ro.isChecked()){
                summary+= "rogged";
            }
        });
    }

}

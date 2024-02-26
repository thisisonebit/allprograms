package com.mandem.allprograms;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class prog_6_RadioButton extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6_radiobutton);
        RadioButton rm = findViewById(R.id.rbMale);
        RadioButton rf = findViewById(R.id.rbFemale);
        RadioButton ro = findViewById(R.id.rbOther);
        RadioGroup rg = findViewById(R.id.genderRadio);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(rm.isChecked()){
                    Toast.makeText(prog_6_RadioButton.this,"Male",Toast.LENGTH_SHORT).show();
                }
                else if(rf.isChecked()){
                    Toast.makeText(prog_6_RadioButton.this,"Female",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(prog_6_RadioButton.this,"Other",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

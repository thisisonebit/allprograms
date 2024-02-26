package com.mandem.allprograms;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class prog_14_TextView extends AppCompatActivity {
    EditText e;
    TextView t;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_14_textview);
        TextView t = findViewById(R.id.t);
        EditText e = findViewById(R.id.et);
        Button b = findViewById(R.id.btn);
        b.setOnClickListener(v->{
            t.setText(e.getText().toString());
        });

    }

}

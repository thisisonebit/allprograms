package com.mandem.allprograms;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class prog_2_AddTwoNumbers extends AppCompatActivity{

    Button btn;
    EditText n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_addnumbers);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(v->{
            if (n1.length()>0 && n2.length()>0){
                int ans = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
                Toast.makeText(this,ans,Toast.LENGTH_SHORT).show();
            }
        });
    }

}
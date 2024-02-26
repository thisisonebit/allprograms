package com.mandem.allprograms;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class prog_15_MultTable extends AppCompatActivity {
    EditText e;
    Button b;
    TextView t;
    int ans=0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_15_multitable);
        EditText e=findViewById(R.id.no);
        Button b=findViewById(R.id.bt);
        TextView t=findViewById(R.id.txt);
        b.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt:
                StringBuffer sb= new StringBuffer(); int res;
                String fs=e.getText().toString();
                int n= Integer.parseInt(fs);
                for (int i=1;i<=10;i++)
                {
                    ans=(i*n);
                    sb.append(i +"X"+n+"="+ans+"\n\n"); }
                t.setText(sb);
                break; }}
}

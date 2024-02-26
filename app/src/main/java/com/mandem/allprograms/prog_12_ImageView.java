package com.mandem.allprograms;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class prog_12_ImageView extends AppCompatActivity {
    ImageView img,img1;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceSatae) {
        super.onCreate(savedInstanceSatae);
        setContentView(R.layout.activity_12_imageview);
        img=findViewById(R.id.img_id);
    }
}

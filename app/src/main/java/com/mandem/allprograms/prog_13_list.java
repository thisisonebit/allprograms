package com.mandem.allprograms;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class prog_13_list extends AppCompatActivity {

    ListView lv;
    String[] DAYS = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_12_imageview);
        lv=(ListView) findViewById(R.id.lst); ArrayAdapter<String> adapter=new
                ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,DAYS); lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Selected Item: "+((TextView) view).getText(),Toast.LENGTH_SHORT).show();
            } });
    }
}

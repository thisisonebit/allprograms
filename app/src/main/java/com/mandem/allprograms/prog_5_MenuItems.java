package com.mandem.allprograms;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.view.ContextMenu.ContextMenuInfo;

public class prog_5_MenuItems extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5_menuitems);
        LinearLayout ll = findViewById(R.id.ll);
        ll.setOnCreateContextMenuListener(this);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo); menu.add(0,0,0,"item 1");
        menu.add(0,1,1,"item 2");
        menu.add(0,2,2,"item 3");
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        super.onContextItemSelected(item);
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show(); return true;
    }
}

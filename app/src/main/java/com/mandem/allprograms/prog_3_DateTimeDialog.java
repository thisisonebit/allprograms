package com.mandem.allprograms;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import android.app.AlertDialog;
import android.app.Dialog;
import android.widget.Button;

public class prog_3_DateTimeDialog extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3_datetimedialog);
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(v ->{
            ShowDateTimeDialog dt = new ShowDateTimeDialog();
            dt.show(getSupportFragmentManager(),null);
        });
    }

    public class ShowDateTimeDialog extends DialogFragment{
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState){
            Calendar c = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyy HH:mm:ss");
            String strDate = sdf.format(c.getTime());
            AlertDialog.Builder builder=new AlertDialog.Builder(getActivity()); builder.setTitle("Date and Time");
            builder.setMessage(strDate);
            builder.setNeutralButton("OK",null);
            return builder.create();
        }
    }
}

package com.cityalert.cityalert;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Formatter;
//import org.apache.commons.lang.StringUtils;

public class PublicarActivity extends AppCompatActivity {

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicar);

        tv1= (TextView) findViewById(R.id.textview1);

        setDate();
    }

    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

    public void setDate(){
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour   = c.get(Calendar.HOUR);
        int minutes   = c.get(Calendar.MINUTE);
        int seconds   = c.get(Calendar.SECOND);

        Formatter fmt = new Formatter();

        String fecha =String.valueOf(fmt.format("%02d",day))+"/"+String.valueOf(fmt.format("%02d",month));//+"/"+String.valueOf(fmt.format("%02d",year));
       // String hora=String.valueOf(fmt.format("%02d",hour))+":"+String.valueOf(fmt.format("%02d",minutes))+":"+String.valueOf(fmt.format("%02d",seconds));
       // StringUtils.leftPad("129018", 10, "0");
        tv1.setText(fecha+" "/*+hora*/);
    }
}

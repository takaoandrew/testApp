package com.example.andrewtakao.testapp;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import android.widget.Toast;

/**
 * Created by andrewtakao on 10/26/16.
 */

public class DateSettings implements DatePickerDialog.OnDateSetListener{
    Context context;
    public DateSettings(Context context){
        this.context = context;
    }
    @Override
    public void onDateSet(DatePicker view, int year, int month, int day) {
        Toast.makeText(context,"Selected date: "+year+"/"+month+"/"+day,Toast.LENGTH_LONG).show();
    }
}

package com.example.andrewtakao.testapp;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

public class TimePickerActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
    }

    public void showDialog(View view) {
        DialogHandler dialogHandler = new DialogHandler();
        dialogHandler.show(getFragmentManager(),"time_picker");
    }

    public void showDialog2(View view) {
        PickerDialog dialogHandler = new PickerDialog();
        dialogHandler.show(getFragmentManager(),"date_picker");

    }
}

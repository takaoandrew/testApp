package com.example.andrewtakao.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void textInputActivity(View view) {
        Intent intent = new Intent(this,TextInputActivity.class);
        startActivity(intent);
    }
    public void autoCompleteActivity(View view) {
        Intent intent = new Intent(this,AutoCompleteActivity.class);
        startActivity(intent);
    }
    public void checkboxActivity(View view) {
        Intent intent = new Intent(this,CheckBoxActivity.class);
        startActivity(intent);
    }
    public void toggleButtonActivity(View view) {
        Intent intent = new Intent(this,ToggleButtonActivity.class);
        startActivity(intent);
    }
    public void spinnerActivity(View view) {
        Intent intent = new Intent(this,SpinnerActivity.class);
        startActivity(intent);
    }
    public void listviewActivity(View view) {
        Intent intent = new Intent(this,ListViewActivity.class);
        startActivity(intent);
    }
    public void timePickerActivity(View view) {
        Intent intent = new Intent(this,TimePickerActivity.class);
        startActivity(intent);
    }

}

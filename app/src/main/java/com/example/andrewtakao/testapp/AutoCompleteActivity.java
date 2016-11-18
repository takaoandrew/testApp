package com.example.andrewtakao.testapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

/**
 * Created by andrewtakao on 10/17/16.
 */
public class AutoCompleteActivity extends Activity {
    AutoCompleteTextView autoCompleteTextView;
    String[] Country_Names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);
        autoCompleteTextView = (AutoCompleteTextView)findViewById(R.id.country);
        Country_Names = getResources().getStringArray(R.array.country_names);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Country_Names);
        autoCompleteTextView.setAdapter(adapter);
    }

}

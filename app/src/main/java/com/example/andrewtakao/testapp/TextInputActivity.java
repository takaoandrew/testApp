package com.example.andrewtakao.testapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by andrewtakao on 10/17/16.
 */
public class TextInputActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input);
    }
    public void Clicked(View view) {
        Toast.makeText(TextInputActivity.this, "Loaded!", Toast.LENGTH_SHORT).show();
    }

}

package com.example.andrewtakao.testapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

/**
 * Created by andrewtakao on 10/18/16.
 */
public class ToggleButtonActivity extends AppCompatActivity {
    TextView textView;
    Switch switch1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);
        textView = (TextView)findViewById(R.id.toggle_status);
        textView.setVisibility(View.INVISIBLE);
        switch1 = (Switch)findViewById(R.id.switch_button);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView.setText("Wifi On");
                    textView.setVisibility(View.VISIBLE);
                }
                else {
                    textView.setText("Wifi Off");
                    textView.setVisibility(View.VISIBLE);
                }
            }
        });
    }
    public void changeToggleState(View view) {
        boolean checked = ((ToggleButton)view).isChecked();
        if (checked){
            textView.setText("Vibrate On");
            textView.setVisibility(View.VISIBLE);
        }
        else {
            textView.setText("Vibrate Off");
            textView.setVisibility(View.VISIBLE);
        }
    }
}

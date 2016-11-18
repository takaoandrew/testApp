package com.example.andrewtakao.testapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by andrewtakao on 10/18/16.
 */
public class CheckBoxActivity extends AppCompatActivity {
    ArrayList<String> selection = new ArrayList<String>();
    TextView final_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        final_result = (TextView)findViewById(R.id.final_selection);
        final_result.setEnabled(false);
    }
    public void selectItem(View view){
        Boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.apple:
                if(checked){
                    selection.add("Apple");
                }
                else{
                    selection.remove("Apple");
                }
                break;
            case R.id.orange:
                if(checked){
                    selection.add("Orange");
                }
                else{
                    selection.remove("Orange");
                }
                break;
            case R.id.grape:
                if(checked){
                    selection.add("Grape");
                }
                else{
                    selection.remove("Grape");
                }
                break;

        }


    }
    public void submit(View view){
        String final_fruit_selection = "";
        for(String fruit : selection) {
            final_fruit_selection = final_fruit_selection + fruit + "\n";
        }
        final_result.setText(final_fruit_selection);
        final_result.setEnabled(true);
    }
}

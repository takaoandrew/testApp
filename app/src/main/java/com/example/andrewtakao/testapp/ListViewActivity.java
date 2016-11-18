package com.example.andrewtakao.testapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {
    ListView listview;
    int[] picture_resource = {
            R.drawable.wp_000001,R.drawable.wp_000002,R.drawable.wp_000003,R.drawable.wp_000004,R.drawable.wp_000005,
            R.drawable.wp_000001,R.drawable.wp_000002,R.drawable.wp_000003,R.drawable.wp_000004,R.drawable.wp_000005
    };
    String[] picture_titles;
    String[] picture_ratings;
    PictureAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listview = (ListView)findViewById(R.id.listview);
        picture_titles = getResources().getStringArray(R.array.picture_titles);
        picture_ratings = getResources().getStringArray(R.array.picture_ratings);
        int counter = 0;
        adapter = new PictureAdapter(getApplicationContext(),R.layout.list_view_custom);
        listview.setAdapter(adapter);
        for (String titles:picture_titles) {
            PictureDataProvider dataProvider = new PictureDataProvider(picture_resource[counter],titles,
                    picture_ratings[counter]);
            adapter.add(dataProvider);
            counter++;
        }


    }
}
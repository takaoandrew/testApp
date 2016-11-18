package com.example.andrewtakao.testapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrewtakao on 10/19/16.
 */
public class PictureAdapter extends ArrayAdapter {
    List list = new ArrayList();
    public PictureAdapter(Context context, int resource) {
        super(context, resource);

    }

    static class DataHandler {
        ImageView Poster;
        TextView title;
        TextView rating;
    }

    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        row = convertView;
        DataHandler handler;
        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.list_view_custom,parent,false);
            handler = new DataHandler();
            handler.Poster=(ImageView)row.findViewById(R.id.picture);
            handler.title=(TextView)row.findViewById(R.id.picture_title);
            handler.rating=(TextView)row.findViewById(R.id.picture_rating);
            row.setTag(handler);
        }
        else {
            handler = (DataHandler)row.getTag();
        }

        PictureDataProvider dataProvider;
        dataProvider = (PictureDataProvider) this.getItem(position);
        handler.Poster.setImageResource(dataProvider.getPicture_resource());
        handler.title.setText(dataProvider.getPicture_title());
        handler.rating.setText(dataProvider.getPicture_rating());
        return row;
    }
}

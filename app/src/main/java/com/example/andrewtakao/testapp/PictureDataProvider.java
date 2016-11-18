package com.example.andrewtakao.testapp;

/**
 * Created by andrewtakao on 10/19/16.
 */
public class PictureDataProvider {
    private int picture_resource;
    private String picture_title;
    private String picture_rating;



    public PictureDataProvider(int picture_resource, String picture_title, String picture_rating){
        this.setPicture_resource(picture_resource);
        this.setPicture_title(picture_title);
        this.setPicture_rating(picture_rating);
     }

    public int getPicture_resource() {
        return picture_resource;
    }

    public void setPicture_resource(int picture_resource) {
        this.picture_resource = picture_resource;
    }

    public String getPicture_title() {
        return picture_title;
    }

    public void setPicture_title(String picture_title) {
        this.picture_title = picture_title;
    }

    public String getPicture_rating() {
        return picture_rating;
    }

    public void setPicture_rating(String picture_rating) {
        this.picture_rating = picture_rating;
    }
}

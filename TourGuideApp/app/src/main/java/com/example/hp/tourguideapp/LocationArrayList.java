package com.example.hp.tourguideapp;

public class LocationArrayList {

    private String title;
    private String location;
    private int image;

    public LocationArrayList(int image, String title, String location) {
        this.image = image;
        this.title = title;
        this.location = location;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}


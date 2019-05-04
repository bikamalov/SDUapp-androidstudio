package com.example.sduapp;

public class News {
    public String title;
    public String description;
    public int Photo;

    public News(String title, String description, int photo) {
        this.title = title;
        this.description = description;
        Photo = photo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPhoto() {
        return Photo;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}

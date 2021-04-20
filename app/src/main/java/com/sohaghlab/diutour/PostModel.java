package com.sohaghlab.diutour;

public class PostModel {  //model class

   int image;
   String title, description, location, date;


    public PostModel(int image, String title, String description, String location, String date) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.location = location;
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

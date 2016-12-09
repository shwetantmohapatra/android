package com.example.drskm.listview;

/**
 * Created by DR SKM on 09-12-2016.
 */

public class dataprovider {
    private int image;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private long id;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public dataprovider(int image, String name) {

        this.image = image;
        this.name = name;
    }


    }





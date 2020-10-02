package com.example.adapterviewapp;

public class ItemConstructor {
    int image;
    String image_text;

    public ItemConstructor(int image, String image_text) {
        this.image = image;
        this.image_text = image_text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getImage_text() {
        return image_text;
    }

    public void setImage_text(String image_text) {
        this.image_text = image_text;
    }
}

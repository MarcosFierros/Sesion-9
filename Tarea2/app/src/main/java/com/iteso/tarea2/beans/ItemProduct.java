package com.iteso.tarea2.beans;

public class ItemProduct {

    private int image;
    private String title;
    private String store;
    private String location;
    private String phone;
    private String description;

    public ItemProduct() {
        this.image = 0;
        this.title = "";
        this.store = "";
        this.location = "";
        this.phone = "";
        this.description = "";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ItemProduct { " +
                " image = " + this.image +
                ", title = " + this.title +
                ", store = " + this.store +
                ", location = " + this.location +
                ", phone = " + this.phone +
                ", description = " + this.description + "}";
    }
}

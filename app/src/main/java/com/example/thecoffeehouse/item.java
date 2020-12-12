package com.example.thecoffeehouse;

public class item {
    String title_115,text_115,bt_115;
    Integer image_115;

    public item(String title, String text, String bt, Integer image) {
        this.title_115 = title;
        this.text_115 = text;
        this.image_115 = image;
        this.bt_115=bt;
    }

    public String getTitle() {
        return title_115;
    }

    public void setTitle(String title) {
        this.title_115 = title;
    }

    public String getText() {
        return text_115;
    }

    public void setText(String text) {
        this.text_115 = text;
    }

    public String getBt() {
        return bt_115;
    }

    public void setBt(String bt) {
        this.bt_115 = bt;
    }

    public Integer getImage() {
        return image_115;
    }

    public void setImage(Integer image) {
        this.image_115 = image;
    }
}

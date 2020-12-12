package com.example.thecoffeehouse;

public class orderItem {
    String title_115,price_115;
    Integer image_115;

    public orderItem(String title, String price, Integer image) {
        this.title_115 = title;
        this.price_115 = price;
        this.image_115 = image;
    }

    public String getTitle() {
        return title_115;
    }

    public void setTitle(String title) {
        this.title_115 = title;
    }

    public String getPrice() {
        return price_115;
    }

    public void setPrice(String price) {
        this.price_115 = price;
    }

    public Integer getImage() {
        return image_115;
    }

    public void setImage(Integer image) {
        this.image_115 = image;
    }
}

package com.example.thecoffeehouse;

import android.widget.Spinner;

public class itemmap {
    String namestore_115,mota_115;
    String x_115,y_115;
    Integer image_115;

    public itemmap(String namestore, String mota, String x, String y, Integer image) {
        this.namestore_115 = namestore;
        this.mota_115 = mota;
        this.x_115 = x;
        this.y_115 = y;
        this.image_115=image;
    }

    public String getNamestore() {
        return namestore_115;
    }

    public void setNamestore(String namestore) {
        this.namestore_115 = namestore;
    }

    public String getMota() {
        return mota_115;
    }

    public void setMota(String mota) {
        this.mota_115 = mota;
    }


    public Integer getImage() {
        return image_115;
    }

    public void setImage(Integer image) {
        this.image_115 = image;
    }

    public String getX() {
        return x_115;
    }

    public void setX(String x) {
        this.x_115 = x;
    }

    public String getY() {
        return y_115;
    }

    public void setY(String y) {
        this.y_115 = y;
    }
}

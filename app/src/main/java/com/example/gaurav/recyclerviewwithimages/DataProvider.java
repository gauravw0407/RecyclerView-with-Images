package com.example.gaurav.recyclerviewwithimages;

/**
 * Created by gaurav on 14/10/16.
 */

public class DataProvider {

    private int img_res;
    private String s_name,s_artist;

    public DataProvider(int img_res,String s_name, String s_artist)
    {
        this.setImg_res(img_res);
        this.setS_name(s_name);
        this.setS_artist(s_artist);
    }

    public int getImg_res() {
        return img_res;
    }

    public void setImg_res(int img_res) {
        this.img_res = img_res;
    }

    public String getS_artist() {
        return s_artist;
    }

    public void setS_artist(String s_artist) {
        this.s_artist = s_artist;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }
}

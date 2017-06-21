package com.reroet.bdtbatch2_latihan.pojo;

/**
 * Created by reroet on 19/06/17.
 */

public class Orang {
    private String nama;
    private String pekerjaan;
    private String imageUrl;

    public Orang(String nama, String pekerjaan, String imageUrl){
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.imageUrl = imageUrl;
    }

    public void setNama(String x){
        nama = x;
    }

    public void setPekerjaan(String x){
        pekerjaan = x;
    }

    public String getNama(){
        return nama;
    }

    public String getPekerjaan(){return pekerjaan;}

    public void setImageUrl(String x){
        imageUrl = x;
    }

    public String getImageUrl(){
        return imageUrl;
    }

}

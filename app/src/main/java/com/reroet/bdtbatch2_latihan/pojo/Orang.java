package com.reroet.bdtbatch2_latihan.pojo;

/**
 * Created by reroet on 19/06/17.
 */

public class Orang {
    private String nama;
    private String pekerjaan;

    public Orang(String nama, String pekerjaan){
        this.nama = nama;
        this.pekerjaan = pekerjaan;
    }

    public void setNama(String x){
        this.nama = x;
    }

    public void setPekerjaan(String x){
        this.pekerjaan = x;
    }

    public String getNama(){
        return this.nama;
    }

    public String getPekerjaan(){
        return this.pekerjaan;
    }
}

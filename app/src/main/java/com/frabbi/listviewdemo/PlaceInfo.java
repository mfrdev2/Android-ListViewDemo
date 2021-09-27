package com.frabbi.listviewdemo;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class PlaceInfo implements Serializable {

    private long id;
    private String  pName;
    private String  pDesc;
    private int  pImg;

    public PlaceInfo(long id,String pName, String pDesc, int pImg) {
        this.id = id;
        this.pName = pName;
        this.pDesc = pDesc;
        this.pImg = pImg;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpDesc() {
        return pDesc;
    }

    public void setpDesc(String pDesc) {
        this.pDesc = pDesc;
    }

    public int getpImg() {
        return pImg;
    }

    public void setpImg(int pImg) {
        this.pImg = pImg;
    }

    @Override
    public String toString() {
        return "PlaceInfo{" +
                "id=" + id +
                ", pName='" + pName + '\'' +
                ", pDesc='" + pDesc + '\'' +
                ", pImg=" + pImg +
                '}';
    }
}

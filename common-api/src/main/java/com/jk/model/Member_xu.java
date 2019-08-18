package com.jk.model;

import java.io.Serializable;

public class Member_xu implements Serializable {
    //会员级别表
    private  Integer  hyid;
    private  String  rank;
    private  Integer  price;
    private  String  tequan;


    public String getTequan() {
        return tequan;
    }

    public void setTequan(String tequan) {
        this.tequan = tequan;
    }

    public Integer getHyid() {
        return hyid;
    }

    public String getRank() {
        return rank;
    }

    public Integer getPrice() {
        return price;
    }

    public void setHyid(Integer hyid) {
        this.hyid = hyid;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}

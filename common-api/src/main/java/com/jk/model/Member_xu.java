package com.jk.model;

public class Member_xu {
    //会员级别表
    private  Integer  hyid;
    private  String  rank;
    private  Integer  price;

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

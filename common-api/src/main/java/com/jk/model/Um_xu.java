package com.jk.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Um_xu implements Serializable {
         //会员列表（客户与会员中间表）
    private   Integer umid;
    private   Integer uid;
    private   Integer mid;
    @DateTimeFormat(pattern="yyyy-MM-dd")   // 处理从 前端到后端的时间
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")   // 处
    private Date addate;
    @DateTimeFormat(pattern="yyyy-MM-dd")   // 处理从 前端到后端的时间
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")   // 处
    private   Date bddate;

    public Integer getUmid() {
        return umid;
    }

    public Integer getUid() {
        return uid;
    }

    public Integer getMid() {
        return mid;
    }

    public Date getAddate() {
        return addate;
    }

    public Date getBddate() {
        return bddate;
    }

    public void setUmid(Integer umid) {
        this.umid = umid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public void setAddate(Date addate) {
        this.addate = addate;
    }

    public void setBddate(Date bddate) {
        this.bddate = bddate;
    }
}

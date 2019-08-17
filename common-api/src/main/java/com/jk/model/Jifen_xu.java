package com.jk.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Jifen_xu implements Serializable {
    //积分表
    private  Integer  jfid;
    private  Integer  uid;
    private  Integer  jftype;
    @DateTimeFormat(pattern="yyyy-MM-dd")   // 处理从 前端到后端的时间
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")   // 处理从	后端到前端的时间
    private Date czdate;
    private  String  activity;
    private  String  glname;
    private  String  cause;
    private  Integer  jifen;
    private  Integer  sum;

    public Integer getJfid() {
        return jfid;
    }

    public Integer getUid() {
        return uid;
    }

    public Integer getJftype() {
        return jftype;
    }

    public Date getCzdate() {
        return czdate;
    }

    public String getActivity() {
        return activity;
    }

    public String getGlname() {
        return glname;
    }

    public String getCause() {
        return cause;
    }

    public Integer getJifen() {
        return jifen;
    }

    public Integer getSum() {
        return sum;
    }

    public void setJfid(Integer jfid) {
        this.jfid = jfid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public void setJftype(Integer jftype) {
        this.jftype = jftype;
    }

    public void setCzdate(Date czdate) {
        this.czdate = czdate;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public void setGlname(String glname) {
        this.glname = glname;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public void setJifen(Integer jifen) {
        this.jifen = jifen;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }
}

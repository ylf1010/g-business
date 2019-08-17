package com.jk.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class BiaoQian_xu implements Serializable {
    //标签表（客户标签）
    private  Integer bqid;
    private  String bqname;
    private  Integer bqsum;
    private  String condition;
    @DateTimeFormat(pattern="yyyy-MM-dd")   // 处理从 前端到后端的时间
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")   // 处理从	后端到前端的时间
    private Date bqdate;

    public Integer getBqid() {
        return bqid;
    }

    public String getBqname() {
        return bqname;
    }

    public Integer getBqsum() {
        return bqsum;
    }

    public String getCondition() {
        return condition;
    }

    public Date getBqdate() {
        return bqdate;
    }

    public void setBqid(Integer bqid) {
        this.bqid = bqid;
    }

    public void setBqname(String bqname) {
        this.bqname = bqname;
    }

    public void setBqsum(Integer bqsum) {
        this.bqsum = bqsum;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setBqdate(Date bqdate) {
        this.bqdate = bqdate;
    }
}

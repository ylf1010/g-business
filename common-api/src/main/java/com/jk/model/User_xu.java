package com.jk.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User_xu {
      //客户user表
    private  Integer id;
    private  String nickname;
    private  Integer phone;
    private  String sex;
    private  String source;
    private  String weixin;
    @DateTimeFormat(pattern="yyyy-MM-dd")   // 处理从 前端到后端的时间
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")   // 处理从	后端到前端的时间
    private  Date statime;
    @DateTimeFormat(pattern="yyyy-MM-dd")   // 处理从 前端到后端的时间
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")   // 处理从	后端到前端的时间
    private Date endtime;
    private  Integer jfid;
    private  Integer member;
    private  String remark;
    private  Integer bqid;

    public Integer getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public Integer getPhone() {
        return phone;
    }

    public String getSex() {
        return sex;
    }

    public String getSource() {
        return source;
    }

    public String getWeixin() {
        return weixin;
    }

    public Date getStatime() {
        return statime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public Integer getJfid() {
        return jfid;
    }

    public Integer getMember() {
        return member;
    }

    public String getRemark() {
        return remark;
    }

    public Integer getBqid() {
        return bqid;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public void setStatime(Date statime) {
        this.statime = statime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public void setJfid(Integer jfid) {
        this.jfid = jfid;
    }

    public void setMember(Integer member) {
        this.member = member;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setBqid(Integer bqid) {
        this.bqid = bqid;
    }
}

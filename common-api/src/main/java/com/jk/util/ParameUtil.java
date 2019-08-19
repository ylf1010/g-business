package com.jk.util;

import java.io.Serializable;

/**
 * 接受 参数的 工具类
 * @author yaoli
 *
 */
public class ParameUtil implements Serializable {
    private Integer pageNumber;
    private Integer pageSize;
    private String sortName;
    private String sortOrder;
    private String bookName;
    private String rolename;
    private String username;

    public String getIdss() {
        return idss;
    }

    public void setIdss(String idss) {
        this.idss = idss;
    }

    private String idss;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }
}

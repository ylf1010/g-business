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
    private String userName;
    private Integer leagid;
    private String productid;
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getProductid() {
		return productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public Integer getLeagid() {
		return leagid;
	}

	public void setLeagid(Integer leagid) {
		this.leagid = leagid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

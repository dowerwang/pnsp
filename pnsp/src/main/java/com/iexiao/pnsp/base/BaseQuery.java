package com.iexiao.pnsp.base;

import java.io.Serializable;
import java.util.Date;

public class BaseQuery implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public static final int DEFAULT_SIZE = 10;

	protected String addOprid;
	
	protected Date addDttm;
	
	protected String updOprid;
	
	protected Date updDttm;
	
	protected Date startTime;
	
	protected Date endTime;
	
	protected Long page = (long) 1;
	
	protected Integer pageSize = 10;
	
	protected Long startRow = (this.getPage() - 1) * this.getPageSize(); //起始行

	public BaseQuery() {
		
	}

	public String getAddOprid() {
		return addOprid;
	}

	public void setAddOprid(String addOprid) {
		this.addOprid = addOprid;
	}

	public Date getAddDttm() {
		return addDttm;
	}

	public void setAddDttm(Date addDttm) {
		this.addDttm = addDttm;
	}

	public String getUpdOprid() {
		return updOprid;
	}

	public void setUpdOprid(String updOprid) {
		this.updOprid = updOprid;
	}

	public Date getUpdDttm() {
		return updDttm;
	}

	public void setUpdDttm(Date updDttm) {
		this.updDttm = updDttm;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Long getPage() {
		return page;
	}

	public void setPage(Long page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getStartRow() {
		return startRow;
	}

	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}
	
}

package com.itu.entity;

import java.util.Date;

/**
 * battery error entity
 * @author xu
 *
 */
public class Error {
	
	private Integer id;
	private Integer errorTypeId;
	private String errorDetail;
	private Integer batteryDataId;
	private Integer handledMark;
	private Date eTime;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getErrorTypeId() {
		return errorTypeId;
	}
	public void setErrorTypeId(Integer errorTypeId) {
		this.errorTypeId = errorTypeId;
	}
	public String getErrorDetail() {
		return errorDetail;
	}
	public void setErrorDetail(String errorDetail) {
		this.errorDetail = errorDetail;
	}
	public Integer getBatteryDataId() {
		return batteryDataId;
	}
	public void setBatteryDataId(Integer batteryDataId) {
		this.batteryDataId = batteryDataId;
	}
	public Integer getHandledMark() {
		return handledMark;
	}
	public void setHandledMark(Integer handledMark) {
		this.handledMark = handledMark;
	}
	public Date geteTime() {
		return eTime;
	}
	public void seteTime(Date eTime) {
		this.eTime = eTime;
	}
	
	
}

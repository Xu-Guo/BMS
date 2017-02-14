package com.itu.entity;

import java.util.Date;

/**
 * Battery alarm entity
 * @author xu
 *
 */
public class Alarm {
	
	private Integer id;
	private Integer alarmTypeId;
	private String alarmDetail;
	private Integer batteryDataId;
	private Integer handledMark;
	private Date aTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAlarmTypeId() {
		return alarmTypeId;
	}
	public void setAlarmTypeId(Integer alarmTypeId) {
		this.alarmTypeId = alarmTypeId;
	}
	public String getAlarmDetail() {
		return alarmDetail;
	}
	public void setAlarmDetail(String alarmDetail) {
		this.alarmDetail = alarmDetail;
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
	public Date getaTime() {
		return aTime;
	}
	public void setaTime(Date aTime) {
		this.aTime = aTime;
	}
	
	
}

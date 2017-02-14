package com.itu.entity;
/**
 * Battery entity
 * @author xu
 *
 */
public class Battery {
	private Integer id;
	private String batteryName;
	private String batteryInfo;
	
	//LatestBatteryData is not a database property
	private BatteryData LatestBatteryData;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBatteryName() {
		return batteryName;
	}
	public void setBatteryName(String batteryName) {
		this.batteryName = batteryName;
	}
	public String getBatteryInfo() {
		return batteryInfo;
	}
	public void setBatteryInfo(String batteryInfo) {
		this.batteryInfo = batteryInfo;
	}
	public BatteryData getLatestBatteryData() {
		return LatestBatteryData;
	}
	public void setLatestBatteryData(BatteryData latestBatteryData) {
		LatestBatteryData = latestBatteryData;
	}
	
	
}

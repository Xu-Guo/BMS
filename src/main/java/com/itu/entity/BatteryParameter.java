package com.itu.entity;

/**
 * BatteryParameter entity
 * @author xu
 *
 */
public class BatteryParameter {
	private Integer id;
	private Integer batteryId;
	private Double rChargeValue;
	private Double rDischargeValue;
	private Integer SensingGain;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBatteryId() {
		return batteryId;
	}
	public void setBatteryId(Integer batteryId) {
		this.batteryId = batteryId;
	}
	public Double getrChargeValue() {
		return rChargeValue;
	}
	public void setrChargeValue(Double rChargeValue) {
		this.rChargeValue = rChargeValue;
	}
	public Double getrDischargeValue() {
		return rDischargeValue;
	}
	public void setrDischargeValue(Double rDischargeValue) {
		this.rDischargeValue = rDischargeValue;
	}
	public Integer getSensingGain() {
		return SensingGain;
	}
	public void setSensingGain(Integer sensingGain) {
		SensingGain = sensingGain;
	}
	
	
	
}

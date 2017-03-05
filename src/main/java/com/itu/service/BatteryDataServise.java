package com.itu.service;

import java.util.List;
import java.util.Map;

import com.itu.entity.BatteryData;

/**
 * BatteryData service interface
 * @author xu
 *
 */
public interface BatteryDataServise {
	/**
	 * get battery data by battery_status
	 * @param map
	 * @return List of BatteryData
	 */
	public List<BatteryData> list(Map<String, Object> map);
	
	/**
	 * get latest battery data with specific battery_id
	 * @param battery_id
	 * @return
	 */
	public BatteryData getLatestDataByBatteryId(Map<String, Object> map);
	
	
	/**
	 * add battery data
	 * @param batteryData
	 * @return
	 */
	public int add(BatteryData batteryData);
}

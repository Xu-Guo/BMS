package com.itu.dao;

import java.util.List;
import java.util.Map;

import com.itu.entity.BatteryData;

/**
 * BatteryData Dao interface
 * @author xu
 *
 */
public interface BatteryDataDao {
	
	/**
	 * get battery data by battery_status
	 * @param map
	 * @return List of BatteryData
	 */
	public List<BatteryData> list(Map<String, Object> map);
	
	/**
	 * get latest battery data with specific battery_id
	 * @param map
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

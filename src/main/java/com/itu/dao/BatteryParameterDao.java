package com.itu.dao;

import java.util.List;
import java.util.Map;

import com.itu.entity.BatteryParameter;

/**
 * BatterParameter Dao layer
 * @author xu
 *
 */
public interface BatteryParameterDao {
	
	/**
	 * Add new batteryParameter
	 * @param batteryParameter
	 * @return
	 */
	public Integer add(BatteryParameter batteryParameter);
	
	/**
	 * Delete batteryParameter
	 * @param id
	 * @return
	 */
	public Integer delete(Integer id);
	
	/**
	 * update batteryParameter information
	 * @param batteryParameter
	 * @return
	 */
	public Integer update(BatteryParameter batteryParameter);
	
	/**
	 * list all 
	 * @return
	 */
	public List<BatteryParameter> list(Map<String, Object> map);
	
	/**
	 * get BatteryParameter by batteryId
	 * @param id
	 * @return
	 */
	public BatteryParameter getByBatteryId(BatteryParameter batteryParameter);
}

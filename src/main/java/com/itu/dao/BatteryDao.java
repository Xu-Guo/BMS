package com.itu.dao;

import java.util.List;
import java.util.Map;

import com.itu.entity.Battery;

/**
 * Battery dao interface
 * @author xu
 *
 */
public interface BatteryDao {
	
	/**
	 * count numbers of smart batteries
	 * @return Integer
	 */
	public Integer count();
	
	/**
	 * get battery object by id
	 * @param id
	 * @return
	 */
	public Battery getById(Map<String, Object> map);
	
	/**
	 * list all batteries
	 * @param
	 * @return
	 */
	public List<Battery> list();
}

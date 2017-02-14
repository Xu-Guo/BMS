package com.itu.service;

import java.util.List;
import java.util.Map;

import com.itu.entity.Battery;


/**
 * battery service interface
 * @author xu
 *
 */
public interface BatteryService {
	
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

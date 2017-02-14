package com.itu.service;

import java.util.List;
import java.util.Map;

import com.itu.entity.Alarm;

/**
 * Alarm service interface
 * @author xu
 *
 */
public interface AlarmService {
	
	/**
	 * list Alarms 
	 * @param map
	 * @return
	 */
	public List<Alarm> list(Map<String, Object> map);
	
	/**
	 * get numbers of alarms
	 * @return
	 */
	public Integer getTotal(Map<String, Object> map);
	
	/**
	 * Edit Alarm
	 * @param Alarm
	 * @return
	 */
	public int update(Alarm alarm);
}

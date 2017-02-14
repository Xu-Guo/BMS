package com.itu.dao;

import java.util.List;
import java.util.Map;

import com.itu.entity.Alarm;


/**
 * Alarm dao interface
 * @author xu
 *
 */
public interface AlarmDao {
	
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

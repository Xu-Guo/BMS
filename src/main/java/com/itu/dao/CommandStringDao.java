package com.itu.dao;

import java.util.Map;

import com.itu.entity.CommandString;

/**
 * commandString dao layer
 * @author xu
 *
 */
public interface CommandStringDao {
	
	/**
	 * get commandStr by type and action
	 * @param map
	 * @return
	 */
	public CommandString getCommandStr(Map<String, Object> map);
	
}

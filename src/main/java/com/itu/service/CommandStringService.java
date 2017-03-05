package com.itu.service;

import java.util.Map;

import com.itu.entity.CommandString;

/**
 * commandString service interface
 * @author xu
 *
 */
public interface CommandStringService {
	
	/**
	 * get commandStr by type and action
	 * @param map
	 * @return
	 */
	public CommandString getCommandStr(Map<String, Object> map);
}

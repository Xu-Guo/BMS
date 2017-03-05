package com.itu.system.factory;


import java.sql.Time;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;


import com.itu.entity.BatteryParameter;
import com.itu.service.BatteryParameterService;
import com.itu.service.CommandStringService;
import com.itu.system.command.Command;
import com.itu.system.command.ParameterSetCommand;
import com.itu.system.command.TimeSetCommand;
import com.itu.util.DateUtil;
/**
 * factory that generates command that local host issues to battery
 * @author xu
 *
 */
public class CommandFactory {
	
	//command type list
	private final byte SET = 1;
	private final byte REQUEST = 2;
	
	//command action list
	private final byte TIME = 1;
	private final byte DATA = 2;
	private final byte PARAMETER = 3;
	
	
	@Resource
	private BatteryParameterService batteryParameterService;
	
	public Command getCommand(String commandType, String commandAction, Integer targetBatteryId ) throws Exception{
		return null;
	}
}

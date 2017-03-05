package com.itu.system.command;


/**
 * BMS system command that local host issues to smart meters
 * NOT a database entity
 * @author xu
 *
 */
public abstract class Command{
	
	private Integer targetBatteryId;
	private String commandStr;

	
	public Integer getTargetBatteryId() {
		return targetBatteryId;
	}
	public void setTargetBatteryId(Integer targetBatteryId) {
		this.targetBatteryId = targetBatteryId;
	}
	public String getCommandStr() {
		return commandStr;
	}
	public void setCommandStr(String commandStr) {
		this.commandStr = commandStr;
	}
	
}

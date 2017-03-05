package com.itu.entity;
/**
 * Command String entity, CommandString can be by certain commandType and commandAction 
 * @author xu
 *
 */
public class CommandString {
	
	private Integer id;
	private String commandType;
	private String commandAction;
	private String commandStr;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCommandType() {
		return commandType;
	}
	public void setCommandType(String commandType) {
		this.commandType = commandType;
	}
	public String getCommandAction() {
		return commandAction;
	}
	public void setCommandAction(String commandAction) {
		this.commandAction = commandAction;
	}
	public String getCommandStr() {
		return commandStr;
	}
	public void setCommandStr(String commandStr) {
		this.commandStr = commandStr;
	}
	
	
	
}

package com.itu.system.command;



public class TimeSetCommand extends Command {
	
	private Integer dataLength;
	private String dateStr;
	
	
	public Integer getDataLength() {
		return dataLength;
	}


	public void setDataLength(Integer dataLength) {
		this.dataLength = dataLength;
	}


	public String getDateStr() {
		return dateStr;
	}


	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}


	public TimeSetCommand(Integer dataLength, String dateStr) {
		super();
		this.dataLength = dataLength;
		this.dateStr = dateStr;
	}
	
}

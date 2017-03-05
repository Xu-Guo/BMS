package com.itu.system.command;

public class ParameterSetCommand extends Command{
		
	private Integer dataLength;
	private String dataStr;
	
	
	public void setDataLength(Integer dataLength) {
		this.dataLength = dataLength;
	}

	public void setDataStr(String dataStr) {
		this.dataStr = dataStr;
	}

	public ParameterSetCommand(Integer dataLength, String dataStr) {
		super();
		this.dataLength = dataLength;
		this.dataStr = dataStr;
	}

	public Integer getDataLength() {
		return dataLength;
	}

	public String getDataStr() {
		return dataStr;
	}


}

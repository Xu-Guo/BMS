package com.itu.entity;


/**
 * BMS User entity
 * @author xu
 *
 */
public class User {
	

	private Integer id;
	private String userName;
	private String password;
	private String role;// user :1  admin :2
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

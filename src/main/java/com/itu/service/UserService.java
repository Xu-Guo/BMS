package com.itu.service;

import com.itu.entity.User;

/**
 * User service interface
 * @author xu
 *
 */
public interface UserService {
	
	/**
	 * get user object by userName
	 * @param userName
	 * @return
	 */
	public User getByUserName(String userName);
	
	/**
	 * update user informations
	 * @param blogger
	 * @return
	 */
	public Integer update(User user);
}

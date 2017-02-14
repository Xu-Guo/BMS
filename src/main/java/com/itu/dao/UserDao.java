package com.itu.dao;

import com.itu.entity.User;

/**
 * User Dao Interface
 * @author xu
 *
 */
public interface UserDao {
	
	/**
	 * get User object by userName
	 * @param userName
	 * @return
	 */
	public User getByUserName(String userName);
	
	/**
	 * update user informations
	 * @param user
	 * @return
	 */
	public Integer update(User user);
}

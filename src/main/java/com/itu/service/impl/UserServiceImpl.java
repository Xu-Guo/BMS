package com.itu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itu.dao.UserDao;
import com.itu.entity.User;
import com.itu.service.UserService;

/**
 * User service implementation 
 * @author xu
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserDao userDao;

	public User getByUserName(String userName) {
		return userDao.getByUserName(userName);
	}

	public Integer update(User user) {
		return userDao.update(user);
	}

	
}

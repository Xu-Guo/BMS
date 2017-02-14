package com.itu.dao;

import java.util.List;
import java.util.Map;

import com.itu.entity.Error;

/**
 * Error dao interface
 * @author xu
 *
 */
public interface ErrorDao {
	
	/**
	 * list errors 
	 * @param map
	 * @return
	 */
	public List<Error> list(Map<String, Object> map);
	
	/**
	 * count numbers of errors
	 * @param map
	 * @return
	 */
	public Integer getTotal(Map<String, Object> map);
	
	/**
	 * Edit Error
	 * @param error
	 * @return
	 */
	public int update(Error error);
}

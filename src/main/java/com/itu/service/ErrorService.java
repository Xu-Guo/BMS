package com.itu.service;

import java.util.List;
import java.util.Map;

import com.itu.entity.Error;




/**
 * error service interface
 * @author xu
 *
 */
public interface ErrorService {
	
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

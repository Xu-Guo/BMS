package com.itu.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itu.dao.ErrorDao;
import com.itu.entity.Error;
import com.itu.service.ErrorService;

@Service("ErrorService")
public class ErrorServiceImpl implements ErrorService {
	
	@Resource
	private ErrorDao errorDao;

	@Override
	public List<Error> list(Map<String, Object> map) {
		return errorDao.list(map);
	}

	@Override
	public Integer getTotal(Map<String, Object> map) {
		return errorDao.getTotal(map);
	}

	@Override
	public int update(Error error) {
		return errorDao.update(error);
	}
	

}

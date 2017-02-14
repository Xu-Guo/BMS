package com.itu.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itu.dao.BatteryDao;
import com.itu.entity.Battery;
import com.itu.service.BatteryService;


@Service("BatteryService")
public class BatteryServiceImpl implements BatteryService{
	
	@Resource
	private BatteryDao batteryDao;

	@Override
	public Integer count() {
		return batteryDao.count();
	}

	@Override
	public Battery getById(Map<String, Object> map) {
		return batteryDao.getById(map);
	}

	@Override
	public List<Battery> list() {
		return batteryDao.list();
	}
	
	

}

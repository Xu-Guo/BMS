package com.itu.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itu.dao.BatteryParameterDao;
import com.itu.entity.BatteryParameter;
import com.itu.service.BatteryParameterService;
/**
 * BatteryParameterService implementation
 * @author xu
 *
 */
@Service("BatteryParameterService")
public class BatteryParameterServiceImpl implements BatteryParameterService{
	
	
	@Resource
	private BatteryParameterDao batteryParameterDao;

	@Override
	public Integer add(BatteryParameter batteryParameter) {
		return batteryParameterDao.add(batteryParameter);
	}

	@Override
	public Integer delete(Integer id) {
		return batteryParameterDao.delete(id);
	}

	@Override
	public Integer update(BatteryParameter batteryParameter) {
		return batteryParameterDao.update(batteryParameter);
	}

	@Override
	public List<BatteryParameter> list(Map<String, Object> map) {
		return batteryParameterDao.list(map);
	}

	@Override
	public BatteryParameter getByBatteryId(BatteryParameter batteryParameter) {
		return batteryParameterDao.getByBatteryId(batteryParameter);
	}

	
}

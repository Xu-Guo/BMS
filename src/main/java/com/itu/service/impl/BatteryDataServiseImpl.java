package com.itu.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itu.dao.BatteryDataDao;
import com.itu.entity.BatteryData;
import com.itu.service.BatteryDataServise;

@Service("BatteryDataServise")
public class BatteryDataServiseImpl implements BatteryDataServise {
	
	@Resource
	private BatteryDataDao batteryDataDao;
	
	@Override
	public List<BatteryData> list(Map<String, Object> map) {
		return batteryDataDao.list(map);
	}

	@Override
	public BatteryData getLatestDataByBatteryId(Map<String, Object> map) {
		return batteryDataDao.getLatestDataByBatteryId(map);
	}

	@Override
	public int add(BatteryData batteryData) {
		return batteryDataDao.add(batteryData);
	}

}

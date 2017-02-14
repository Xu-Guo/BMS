package com.itu.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itu.dao.AlarmDao;

import com.itu.entity.Alarm;
import com.itu.service.AlarmService;

@Service("AlarmService")
public class AlarmServiceImpl implements AlarmService {
	
	@Resource
	private AlarmDao alarmDao;

	@Override
	public List<Alarm> list(Map<String, Object> map) {
		return alarmDao.list(map);
	}

	@Override
	public Integer getTotal(Map<String, Object> map) {
		return alarmDao.getTotal(map);
	}

	@Override
	public int update(Alarm alarm) {
		return alarmDao.update(alarm);
	}
	
	
}

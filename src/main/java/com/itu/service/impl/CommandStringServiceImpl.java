package com.itu.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itu.dao.CommandStringDao;
import com.itu.entity.CommandString;
import com.itu.service.CommandStringService;

/**
 * CommandString Service implementation
 * @author xu
 *
 */
@Service("CommandStringService")
public class CommandStringServiceImpl implements CommandStringService{
	
	@Resource
	private CommandStringDao commandStringDao;

	@Override
	public CommandString getCommandStr(Map<String, Object> map) {
		return commandStringDao.getCommandStr(map);
	}

}

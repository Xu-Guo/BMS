package com.itu.controller.pub;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.itu.service.CommandStringService;
import com.itu.system.command.Command;
import com.itu.system.factory.CommandFactory;


/**
 * public command controller for user issue command to smart meter
 * @author xu
 *
 */
@Controller
@RequestMapping("public/command")
public class CommandController {
	
	@Resource
	private CommandStringService commandStringService;
	
	@RequestMapping("/issue")
	public String issue(@RequestParam(value="targerBatteryId", required=true)Integer targetBatteryId, 
			@RequestParam(value="commandType", required=true) String commandType, 
			@RequestParam(value="commandAction", required=false) String commandAction, HttpServletResponse response) throws Exception{
		
		CommandFactory commandFactory = new CommandFactory();
		Command command = commandFactory.getCommand(commandType,commandAction,targetBatteryId);
		return null;
	}

}

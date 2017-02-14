package com.itu.controller.pub;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itu.entity.Alarm;
import com.itu.service.AlarmService;
import com.itu.util.ResponseUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/**
 * Alarm controller layer
 * @author xu
 *
 */
@Controller
@RequestMapping("/public/alarm")
public class AlarmController {
	
	@Resource
	private AlarmService alarmService;
	
	@RequestMapping("/list")
	public String list(@RequestParam(value="handledMark", required=false)String handledMark,HttpServletResponse response) throws Exception{
		Map<String, Object> map = new HashMap<>();
		map.put("handledMark", handledMark);
		List<Alarm> list = alarmService.list(map);
		Integer total = alarmService.getTotal(map);
		JSONObject result = new JSONObject();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd"));
		JSONArray jsonArray = JSONArray.fromObject(list,jsonConfig);
		result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * Alarm review
	 * @param ids
	 * @param handledMark
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/review")
	public String review(@RequestParam(value="ids", required=false)String ids, @RequestParam(value="handledMark", required=false)Integer handledMark,  HttpServletResponse response)throws Exception{
		String[] idsStr=ids.split(",");
		for(int i = 0; i < idsStr.length; i++){
			Alarm alarm = new Alarm();
			alarm.setId(Integer.parseInt(idsStr[i]));
			alarm.setHandledMark(handledMark);
			alarmService.update(alarm);

		}
		JSONObject result = new JSONObject();
		result.put("success", true);
		ResponseUtil.write(response, result);
		return null;

	}
}

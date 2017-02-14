package com.itu.controller.pub;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itu.entity.Alarm;
import com.itu.entity.BatteryData;
import com.itu.entity.Error;
import com.itu.service.AlarmService;
import com.itu.service.BatteryDataServise;
import com.itu.service.ErrorService;

/**
 * public battery data controller layer
 * @author xu
 *
 */
@Controller
@RequestMapping("public/batterydata")
public class BatteryDataController {
	
	@Resource
	private BatteryDataServise batteryDataServise;
	@Resource
	private ErrorService errorService;
	@Resource
	private AlarmService alarmService;
	
	/**
	 * get battery data, error and alarm by batteryData id
	 * @param id
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/details/{id}")
	public ModelAndView details(@PathVariable("id") Integer id, HttpServletRequest request) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		
		//get battery data
		Map<String, Object> map = new HashMap<>();
		map.put("id", id);
		List<BatteryData> bList= batteryDataServise.list(map);

		modelAndView.addObject("batteryData", bList.get(0));
		if(!bList.isEmpty()){
			//get errors and alarms of the battery data if any
			Map<String, Object> map2 = new HashMap<>();
			map.put("batteryDataId", bList.get(0).getId());
			
			List<Error> elist = errorService.list(map2);
			List<Alarm> alist = alarmService.list(map2);
			
			modelAndView.addObject("errorList", elist);
			modelAndView.addObject("alarmList", alist);	

		}
		modelAndView.setViewName("dataDetail");
		return modelAndView;
	}
}

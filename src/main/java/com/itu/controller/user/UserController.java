package com.itu.controller.user;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itu.entity.User;
import com.itu.service.UserService;
import com.itu.util.ResponseUtil;

import net.sf.json.JSONObject;

/**
 * Normal user controller layer
 * @author xu
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	/**
	 * change password
	 * @param newPassword
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/modifyPassword")
	public String modifyPassword(String newPassword, HttpServletResponse response)throws Exception{
		User user = (User) SecurityUtils.getSubject().getSession().getAttribute("currentUser");
		if(user!=null && user.getRole().equals("2")){//not allowed to modify admin's password
			return "unauthor";
		}else if(user.getRole().equals("1")){
			user.setPassword(newPassword);
			int resultTotal = userService.update(user);
			JSONObject result = new JSONObject();
			
			if(resultTotal > 0){
				result.put("success", true);
			}else{
				result.put("success", false);
			}
			ResponseUtil.write(response, result);
		}
		
		return null;
	}
}

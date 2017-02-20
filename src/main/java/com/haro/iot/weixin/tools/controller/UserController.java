package com.haro.iot.weixin.tools.controller;

import com.haro.iot.weixin.core.pojo.TUser;
import com.haro.iot.weixin.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
	      @Autowired
	    private UserService userService;
	      
	    @RequestMapping("/showInfo/{userId}")
	    public String showUserInfo(ModelMap modelMap, @PathVariable int userId){
	    	TUser userInfo = userService.getUserById(userId);
	        modelMap.addAttribute("userInfo", userInfo);  
	        return "/user/showInfo";  
	    }  
	      
	    @RequestMapping("/showInfos/{userId}")
	    public @ResponseBody
        Object showUserInfos(@PathVariable int userId){
	        TUser userInfos = userService.getUserById(userId);  
	        return userInfos;  
	    }  

}

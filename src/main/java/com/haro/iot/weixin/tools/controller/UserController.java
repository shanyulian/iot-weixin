package com.haro.iot.weixin.tools.controller;

import com.haro.iot.weixin.core.pojo.TUser;
import com.haro.iot.weixin.core.service.UserService;
import com.haro.iot.weixin.thread.pool.ExecutorProcessPool;
import com.haro.iot.weixin.thread.task.TestTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

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
	@ResponseBody
	@GetMapping(produces = "text/plain;charset=utf-8")
	public String authGet(@RequestParam(name = "name", required = false) String name){
		//ExecutorProcessPool.getInstance().execute(new TestTask(name));
		ExecutorProcessPool pool = ExecutorProcessPool.getInstance();
		pool.execute(new TestTask(name));
		return "ok";
	}

}

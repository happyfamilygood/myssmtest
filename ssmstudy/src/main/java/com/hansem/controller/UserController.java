package com.hansem.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hansem.model.User;
import com.hansem.service.IUserService;

@Controller
@RequestMapping("/user")
// /user/**
public class UserController {
	private static Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	@Resource  
	 private IUserService userService; 

	@RequestMapping(value="/{id}",method=RequestMethod.GET) 
	public @ResponseBody User getUserInJson(@PathVariable String id) {
                int a = 1;
		System.out.println();
		int userId = Integer.parseInt(id);  
        User user = this.userService.getUserById(userId); 
        LOGGER.info(user.toString());
        return user;  
	}

}

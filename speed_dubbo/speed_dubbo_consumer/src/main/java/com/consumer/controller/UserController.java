package com.consumer.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.service.UserService;

@Controller
@RequestMapping("speed/")
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("login")
	public String login() {
		userService.login();
		return "";
	}
	
}

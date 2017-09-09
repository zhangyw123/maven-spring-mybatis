package com.cn.xtzn.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.xtzn.pojo.User;
import com.cn.xtzn.service.UserService;

@Controller
public class UserController {

	private static final Logger logger = Logger.getLogger(UserController.class);
	
	
	
	@Resource
	private UserService userService;
	
	@RequestMapping("login")
	public String login(User user,HttpServletRequest request){
		System.out.println(user);
		User user1 = userService.select1(user);
		System.out.println(user1);
		HttpSession session = request.getSession();
		session.setAttribute("msg", user1);
		return "redirect:test2.jsp"; 
	}
}

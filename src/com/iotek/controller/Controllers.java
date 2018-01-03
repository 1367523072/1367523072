package com.iotek.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iotek.service.UserService;

import comiotek.entity.User;

@Controller
public class Controllers {
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("/regist")
	public String regist(String name,String password) {
		User user = userService.find(name);
		String data="";
		if(user !=null) {
			data="1";
		}else {
			userService.add(new User(name,password));
			data="0";
		}
		return data;
	}
	@ResponseBody
	@RequestMapping("/check")
	public String check(String name) {
		User user = userService.find(name);
		String data="";
		if(user !=null) {
			data="1";
		}else {
			data="0";
		}
		return data;
	}
	@ResponseBody
	@RequestMapping("/login")
	public String login(String name,String password,HttpSession session) {
		System.out.println(name+password);
		User user = userService.find(name);
		String data="";
		if(user.getPassword().equals(password)) {
			data="1";
			session.setAttribute("user", user);
		}else {
			data="0";
		}
		return data;
	}
	@ResponseBody
	@RequestMapping("/checkPassword")
	public String checkPassword(String password,HttpSession session) {
		User user = (User) session.getAttribute("user");
		String data="";
		if(user.getPassword().equals(password)) {
			data="1";
		}else {
			data="0";
		}
		return data;
	}
	@ResponseBody
	@RequestMapping("/changePaaword")
	public String changePaaword(String password,HttpSession session) {
		User user = (User) session.getAttribute("user");
		String data="";
		int i = userService.changePassword(password, user.getId());
		if(i==1) {
			data = "1";
		}else {
			data = "0";
		}
		return data;
	}
}

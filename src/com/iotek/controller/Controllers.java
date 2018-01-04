package com.iotek.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iotek.service.DepartmentService;
import com.iotek.service.PositionService;
import com.iotek.service.ResumeService;
import com.iotek.service.UserService;

import comiotek.entity.Department;
import comiotek.entity.Position;
import comiotek.entity.Resume;
import comiotek.entity.User;

@Controller
public class Controllers {
	@Autowired
	private UserService userService;
	
	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private PositionService positionService;
	
	@Autowired
	private ResumeService resumeService;
	
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
	
	@RequestMapping("/watchResume")
	public String resume(Model model,HttpSession session) {
		User user = (User) session.getAttribute("user");
		Resume resume = resumeService.queryOneByUserId(user.getId());
		List<Department> departments = departmentService.queryAllDepartment();
		List<Position> positions = positionService.queryAll();
		model.addAttribute("departments", departments);
		model.addAttribute("positions", positions);
		model.addAttribute("resume", resume);
		return "resume";
	}
	
	@RequestMapping("/resume")
	public String addResume(Resume resume,Model model,HttpSession session) {
		User user = (User) session.getAttribute("user");
		Resume queryOneByUserId = resumeService.queryOneByUserId(user.getId());
		if(queryOneByUserId==null) {
			resumeService.addResume(resume);
		}else {
			resumeService.updateResume(resume);
		}
		return "resume";
	}
	
	
}

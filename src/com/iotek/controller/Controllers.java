package com.iotek.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iotek.entity.ApplicationForm;
import com.iotek.entity.Department;
import com.iotek.entity.FeedbackForm;
import com.iotek.entity.Position;
import com.iotek.entity.Resume;
import com.iotek.entity.User;
import com.iotek.service.ApplicationFormService;
import com.iotek.service.DepartmentService;
import com.iotek.service.FeedbackFormService;
import com.iotek.service.PositionService;
import com.iotek.service.ResumeService;
import com.iotek.service.UserService;

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
	
	@Autowired
	private ApplicationFormService applicationFormService;
	
	@Autowired
	private FeedbackFormService feedbackFormService;
	
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
			if(user.getStatus()==1) {  //����Ա
				data="2";
			}else if(user.getStatus()==0){//�ο�
				data="1";
				List<FeedbackForm> FeedbackForms = feedbackFormService.queryByUIDAndStatus(user.getId()); //δ�鿴�ķ�����
				session.setAttribute("noFeedbackForms", FeedbackForms);
				List<FeedbackForm> query = feedbackFormService.query(user.getId());//�Ѳ鿴�ķ�����
				session.setAttribute("query", query);
				System.out.println(user.getId());
				System.out.println(FeedbackForms);
				ApplicationForm applicationForm = new ApplicationForm();  //��Ӽ���������һ��ӦƸ��
				applicationForm.setDate(new Date());
				applicationForm.setuId(user.getId());
				applicationFormService.addApplicationForm(applicationForm);
				
			}else if(user.getStatus()==2){             //Ա��
				data="1";
			}else {                                  //����
				data="1"; 
			}
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
			FeedbackForm feedbackForm = new FeedbackForm();
			feedbackForm.setuId(user.getId());
			feedbackForm.setDate(new Date());
			feedbackFormService.addFeedbackForm(feedbackForm);
			ApplicationForm applicationForm = new ApplicationForm();
			applicationForm.setuId(user.getId());
			applicationForm.setDate(new Date());
			applicationFormService.addApplicationForm(applicationForm);
		}else {
			resumeService.updateResume(resume);
		}
		return "resume";
	}
	@RequestMapping("/ApplicationManagement")
	public String applicationManagement(Model model) {    //�鿴ӦƸ��
		List<ApplicationForm> list = applicationFormService.queryAllApplicationForm();
		model.addAttribute("list", list);
		return "manager";
	}
	@RequestMapping("/view")
	public String view(Model model,int uId) {       //�鿴����
		Resume resume = resumeService.queryOne(uId);
		System.out.println(resume);
		model.addAttribute("resume", resume);
		return "manager";
	}
	@RequestMapping("/delete")
	public String delete(Model model,int id) {       //ɾ��ӦƸ��
		applicationFormService.deleteApplicationForm(id);
		List<ApplicationForm> list = applicationFormService.queryAllApplicationForm();
		model.addAttribute("list", list);
		return "manager";
	}
	
	@RequestMapping("/depart")
	public String depart(Model model) {       //���Ź���
		List<Position> positions = positionService.queryAll();
		List<Department> departments = departmentService.queryAllDepartment();
		System.out.println(departments);
		model.addAttribute("departments", departments);
		model.addAttribute("positions", positions);
		return "departManage";
	}
	
	
}

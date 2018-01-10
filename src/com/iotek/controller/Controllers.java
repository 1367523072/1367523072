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
import com.iotek.entity.Attendance;
import com.iotek.entity.Department;
import com.iotek.entity.Employee;
import com.iotek.entity.FeedbackForm;
import com.iotek.entity.Position;
import com.iotek.entity.PrizeInfo;
import com.iotek.entity.Resume;
import com.iotek.entity.Salary;
import com.iotek.entity.Train;
import com.iotek.entity.User;
import com.iotek.entity.WageDiscrepancy;
import com.iotek.service.ApplicationFormService;
import com.iotek.service.AttendanceService;
import com.iotek.service.DepartmentService;
import com.iotek.service.EmployeeService;
import com.iotek.service.FeedbackFormService;
import com.iotek.service.HiringTableService;
import com.iotek.service.PositionService;
import com.iotek.service.PrizeInfoService;
import com.iotek.service.ResumeService;
import com.iotek.service.SalaryService;
import com.iotek.service.TrainService;
import com.iotek.service.UserService;
import com.iotek.service.WageDiscrepancyService;
import com.iotek.util.Util;

@Controller
public class Controllers {
	@Autowired
	private UserService userService; // �ο�

	@Autowired
	private DepartmentService departmentService;// ����

	@Autowired
	private PositionService positionService;// ְλ

	@Autowired
	private ResumeService resumeService;// ����

	@Autowired
	private ApplicationFormService applicationFormService;// ӦƸ��

	@Autowired
	private FeedbackFormService feedbackFormService;// ������

	@Autowired
	private AttendanceService attendanceService;// ����

	@Autowired
	private HiringTableService hiringTableService;// ��Ƹ��Ϣ

	@Autowired
	private PrizeInfoService prizeInfoService;// ���ͱ�

	@Autowired
	private SalaryService salaryService;// ����

	@Autowired
	private TrainService trainService;// ��ѵ

	@Autowired
	private WageDiscrepancyService wageDiscrepancyService;// ����

	@Autowired
	private EmployeeService employeeService;// Ա��

	@ResponseBody
	@RequestMapping("/regist") // ע��
	public String regist(String name, String password) {
		User user = userService.find(name);
		String data = "";
		if (user != null) {
			data = "1";
		} else {
			userService.add(new User(name, password));
			data = "0";
		}
		return data;
	}

	@ResponseBody
	@RequestMapping("/check") //��������Ƿ����
	public String check(String name) {
		User user = userService.find(name);
		String data = "";
		if (user != null) {
			data = "1";
		} else {
			data = "0";
		}
		return data;
	}

	@ResponseBody
	@RequestMapping("/login") //��¼
	public String login(String name, String password, HttpSession session) {
		User user = userService.find(name);
		String data = "";
		if (user.getPassword().equals(password)) {
			if (user.getStatus() == 1) { // ����Ա
				data = "2";
			} else if (user.getStatus() == 0) {// �ο�
				data = "1";
				List<FeedbackForm> FeedbackForms = feedbackFormService.queryByUIDAndStatus(user.getId()); // δ�鿴�ķ�����
				session.setAttribute("noFeedbackForms", FeedbackForms);
				List<FeedbackForm> query = feedbackFormService.query(user.getId());// �Ѳ鿴�ķ�����
				session.setAttribute("query", query);
				ApplicationForm applicationForm = new ApplicationForm(); // ��Ӽ���������һ��ӦƸ��
				applicationForm.setDate(new Date());
				applicationForm.setuId(user.getId());
				applicationFormService.addApplicationForm(applicationForm);

			} else if (user.getStatus() == 2) { // Ա��
				data = "3";
			} else { // ����
				data = "4";
			}
			session.setAttribute("user", user);
		} else {
			data = "0";
		}
		return data;
	}

	@ResponseBody
	@RequestMapping("/checkPassword") //�ж������Ƿ���ȷ
	public String checkPassword(String password, HttpSession session) {
		User user = (User) session.getAttribute("user");
		String data = "";
		if (user.getPassword().equals(password)) {
			data = "1";
		} else {
			data = "0";
		}
		return data;
	}

	@ResponseBody
	@RequestMapping("/changePaaword") //�޸�����
	public String changePaaword(String password, HttpSession session) {
		User user = (User) session.getAttribute("user");
		String data = "";
		int i = userService.changePassword(password, user.getId());
		if (i == 1) {
			data = "1";
		} else {
			data = "0";
		}
		return data;
	}

	@RequestMapping("/watchResume") //�鿴����
	public String resume(Model model, HttpSession session) {
		User user = (User) session.getAttribute("user");
		Resume resume = resumeService.queryOneByUserId(user.getId());
		List<Department> departments = departmentService.queryAllDepartment();
		List<Position> positions = positionService.queryAll();
		model.addAttribute("departments", departments);
		model.addAttribute("positions", positions);
		model.addAttribute("resume", resume);
		return "resume";
	}

	@RequestMapping("/resume") //�������
	public String addResume(Resume resume, Model model, HttpSession session) {
		User user = (User) session.getAttribute("user");
		Resume queryOneByUserId = resumeService.queryOneByUserId(user.getId());
		if (queryOneByUserId == null) {
			resumeService.addResume(resume);
			FeedbackForm feedbackForm = new FeedbackForm(); //������� ����������
			feedbackForm.setuId(user.getId());
			feedbackForm.setDate(new Date());
			feedbackFormService.addFeedbackForm(feedbackForm);
			ApplicationForm applicationForm = new ApplicationForm(); // ����ӦƸ��
			applicationForm.setuId(user.getId());
			applicationForm.setDate(new Date());
			applicationFormService.addApplicationForm(applicationForm);
		} else {
			resumeService.updateResume(resume);
		}
		return "resume";
	}

	@RequestMapping("/ApplicationManagement")
	public String applicationManagement(Model model) { // �鿴ӦƸ��
		List<ApplicationForm> list = applicationFormService.queryAllApplicationForm();
		model.addAttribute("list", list);
		return "ApplicationManagement";
	}

	@RequestMapping("/view")
	public String view(Model model, int userId) { // �鿴����
		Resume resume = resumeService.queryOneByUserId(userId);
		model.addAttribute("resume", resume);
		return "ApplicationManagement";
	}
	@RequestMapping("/interviewTime")
	public String interviewTime(Model model, int uId,String interviewTime) { // ȷ������ʱ��
		List<FeedbackForm> queryByUID = feedbackFormService.queryByUID(uId);
		for (FeedbackForm feedbackForm : queryByUID) {
			feedbackForm.setInterviewTime(new Date());
			feedbackFormService.addFeedbackForm(feedbackForm);
			System.out.println(feedbackForm);
		}
		return "ApplicationManagement";
	}

	@RequestMapping("/delete")
	public String delete(Model model, int id) { // ɾ��ӦƸ��
		applicationFormService.deleteApplicationForm(id);
		List<ApplicationForm> list = applicationFormService.queryAllApplicationForm();
		model.addAttribute("list", list);
		return "ApplicationManagement";
	}

	@RequestMapping("/depart")
	public String depart(Model model) { // ���Ź���
		List<Position> positions = positionService.queryAll();
		List<Department> departments = departmentService.queryAllDepartment();
		System.out.println(departments);
		model.addAttribute("departments", departments);
		model.addAttribute("positions", positions);
		return "departManage";
	}

	@RequestMapping("/train")
	public String train(Model model) { // ��ѵ����
		List<Train> trains = trainService.queryAllTrain();
		model.addAttribute("trains", trains);
		List<Department> departments = departmentService.queryAllDepartment();
		model.addAttribute("departments", departments);
		return "train";
	}

	@RequestMapping("/delTrains")
	public String del(Model model, int id) { // ɾ����ѵ
		trainService.deleteTrain(id);
		List<Train> trains = trainService.queryAllTrain();
		model.addAttribute("trains", trains);
		return "train";
	}

	@RequestMapping("/addTrains")
	public String addTrains(HttpSession session, String name, String dept) { // �����ѵ
		Train train = new Train();
		train.setName(name);
		train.setDate(new Date());
		train.setDept(dept);
		trainService.addTrain(train);
		List<Train> trains = trainService.queryAllTrain();
		session.setAttribute("trains", trains);
		return "train";
	}

	@RequestMapping("/")
	public String prizeInfo(Model model, String name, String dept) { // �����ѵ
		Train train = new Train();
		train.setName(name);
		train.setDate(new Date());
		train.setDept(dept);
		trainService.addTrain(train);
		List<Train> trains = trainService.queryAllTrain();
		model.addAttribute("trains", trains);
		return "train";
	}

	@RequestMapping("/employee")
	public String employee(Model model, HttpSession session) { // �鿴������Ϣ
		User user = (User) session.getAttribute("user");
		System.out.println(user);
		Employee employee = employeeService.query(user.getId());
		System.out.println(employee);
		model.addAttribute("employee", employee);
		return "employees";
	}

	@RequestMapping("/attendance")
	public String attendance(Model model, HttpSession session) { // �鿴���˿���
		User user = (User) session.getAttribute("user");
		Employee employee = employeeService.query(user.getId());
		model.addAttribute("employee", employee);
		return "attendance";
	}

	@RequestMapping("/prizeInfo")
	public String prizeInfo(Model model, HttpSession session) { // �鿴���˽���
		User user = (User) session.getAttribute("user");
		Employee employee = employeeService.query(user.getId());
		model.addAttribute("employee", employee);
		return "prizeInfo";
	}

	@RequestMapping("/salary")
	public String salary(Model model, HttpSession session) { // �鿴���˹���
		User user = (User) session.getAttribute("user");
		Employee employee = employeeService.query(user.getId());
		model.addAttribute("employee", employee);
		return "salary";
	}

	@RequestMapping("/wageDiscrepancy")
	@ResponseBody
	public String wageDiscrepancy(int id, String reason) { // �������
		WageDiscrepancy wageDiscrepancy = new WageDiscrepancy();
		wageDiscrepancy.seteId(id);
		wageDiscrepancy.setReason(reason);
		wageDiscrepancy.setDate(new Date());
		int i = wageDiscrepancyService.addWageDiscrepancy(wageDiscrepancy);
		String data = "";
		if (i == 1) {
			data = "1";
		} else {
			data = "0";
		}
		return data;
	}

	@RequestMapping("/judge")
	@ResponseBody
	public String judge(HttpSession session) { // �ж��Ƿ�����
		String data = "";
		User user = (User) session.getAttribute("user");
		List<Attendance> list = attendanceService.queryOneAll(user.getId());
		for (Attendance a : list) {
			if (Util.isSameDate(a.getOfficeHours(), new Date())) {
				if (a.getClosingTime() != null) {
					data = "2";
					break;
				} else {
					data = "1";
					break;
				}
			}
		}
		if ((!data.equals("2")) && (!data.equals("1"))) {
			data = "0";
		}
		return data;
	}

	@RequestMapping("/officeHours")
	@ResponseBody
	public String addOfficeHours(HttpSession session) { // �ϰ��
		User user = (User) session.getAttribute("user");
		int i = attendanceService.addAttendance(user.getId(), user.getName(), new Date());
		String data = "";
		if (i == 1) {
			data = "1";
		} else {
			data = "0";
		}
		return data;
	}

	@RequestMapping("/closingTime")
	@ResponseBody
	public String addClosingTime(HttpSession session) { // �°��
		String data = "";
		User user = (User) session.getAttribute("user");
		List<Attendance> list = attendanceService.queryOneAll(user.getId());
		for (Attendance a : list) {
			if (Util.isSameDate(a.getOfficeHours(), new Date())) {
				attendanceService.addClosingTime(a.getId(), new Date());
				data = "1";
				int i = a.getOfficeHours().getHours();
				if (i > 9 && i <= 10) {
					a.setLate("�ٵ�");
				} else if (i > 10) {
					a.setLate("����");
				} else {
					a.setLate("�����ϰ�");
				}
				int j = a.getClosingTime().getHours();
				if (j > 17 && j <= 18) {
					a.setLate("�����°�");
				} else if (i <17&& j >= 16) {
					a.setLate("����");
				} else {
					a.setLate("����");
				}
				break;
			}
		}
		if (!data.equals("1")) {
			data = "0";
		}
		return data;
	}
	
	@RequestMapping("/interView")
	public String interView(Model model) { // �鿴����֪ͨ
		List<FeedbackForm> feedbackForms = feedbackFormService.queryAll();
		model.addAttribute("feedbackForms", feedbackForms);
		return "feedbackForms";
	}
	@RequestMapping("/inter")
	public String inter(Model model,int userId) { // �鿴����
		Resume resume = resumeService.queryOneByUserId(userId);
		model.addAttribute("resume", resume);
		return "interResume";
	}
	@RequestMapping("/hire")
	public String hire(int userId) { //¼��
		employeeService.addEmployee(userId, new Date());
		feedbackFormService.del(userId);
		Employee query = employeeService.query(userId);
		userService.changeStatus(userId);
		System.out.println(query);
		return "interResume";
	}
	@RequestMapping("/allEmployee")
	public String allEmployee(Model model) { //�鿴����Ա��
		List<Employee> employees = employeeService.queryAll();
		model.addAttribute("employees", employees);
		return "allEmployee";
	}
	@RequestMapping("/dismiss")
	@ResponseBody
	public String dismiss(int id) { //����Ա��
		int i = employeeService.del(id);
		String data = "";
		if(i==0) {
			data="0";
		}else {
			data="1";
		}
		return data;
	}
	@RequestMapping("/payoff")
	@ResponseBody
	public String payoff(int eId) { //���Ź���
		boolean sameDate = Util.isSameDate(new Date());
		String data = "";
		if(!sameDate) {
			data="0";
		}else {
			List<PrizeInfo> prizeInfos = prizeInfoService.queryByEId(eId);
			Employee employee = employeeService.query(eId);
			System.out.println(employee);
			Salary salary = new Salary();
			salary.seteName(employee.getResume().getName());
			int rewardsPunishmentsWages = 0;
			if(prizeInfos != null) {
				for (PrizeInfo prizeInfo : prizeInfos) {
					rewardsPunishmentsWages += prizeInfo.getAmount();
				}
			}
			salary.setRewardsPunishmentsWages(rewardsPunishmentsWages);
			salaryService.addSalary(salary);
			data="1";
		}
		return data;
	}
	@RequestMapping("/attendances")
	public String attendances(Model model,int userId) { //��ѯ����
		List<Attendance> attendances = attendanceService.queryOneAll(userId);
		model.addAttribute("attendances", attendances);
		return "attendances";
	}
}

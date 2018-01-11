package com.iotek.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iotek.dao.ApplicationFormDao;
import com.iotek.dao.DepartmentDao;
import com.iotek.dao.EmployeeDao;
import com.iotek.dao.FeedbackFormDao;
import com.iotek.dao.PositionDao;
import com.iotek.dao.PrizeInfoDao;
import com.iotek.dao.ResumeDao;
import com.iotek.dao.SalaryDao;
import com.iotek.dao.TrainDao;
import com.iotek.dao.UserDao;
import com.iotek.dao.WageDiscrepancyDao;
import com.iotek.entity.ApplicationForm;
import com.iotek.entity.Department;
import com.iotek.entity.Employee;
import com.iotek.entity.Position;
import com.iotek.entity.PrizeInfo;
import com.iotek.entity.Resume;
import com.iotek.entity.Salary;
import com.iotek.entity.Train;
import com.iotek.entity.User;
import com.iotek.entity.WageDiscrepancy;
import com.iotek.util.Util;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mvc.xml", "classpath:spring-mybatis.xml", "classpath:spring.xml"})
public class YouKnow {
	@Autowired
	private ApplicationFormDao applicationFormDao;
	@Autowired
	private ResumeDao resumeDao;
	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private FeedbackFormDao feedbackFormDao;
	@Autowired
	private DepartmentDao departmentDao;
	@Autowired
	private PositionDao positionDao;
	@Autowired
	private PrizeInfoDao prizeInfoDao;
	@Autowired
	private SalaryDao salaryDao;
	@Autowired
	private WageDiscrepancyDao wageDiscrepancyDao;
	@Test
	public void test() {
		/*User user = new User(-1,"张三","123456");
		int i = userDao.insert(user);
		System.out.println(i);
		int del = userDao.del(1);
		System.out.println(del);
		User query = userDao.query("张三");
		System.out.println(query);
		int i = userDao.changePassword("qwert", 16);
		System.out.println(i);*/
		
		//int i = resumeDao.addResume(new Resume("1",,1,"1","1","1","1","1","1","1","1","1"));
		//System.out.println(i);
		//int j = resumeDao.updateResume(new Resume(1,"1",111,1,"1","1","1",1,1,"1","1","1","1","1",1));
		//System.out.println(j);
		//resumeDao.addResume(new Resume("1","2","2","1","1","1","1","1","1","1","1","1","1",1));
		Resume resume = resumeDao.queryOneByUserId(23);
		System.out.println(resume);
	}
	
	@Test
	public void test1() {
		//departmentDao.addOneDepartment(new Department(-1,"后期部"));
		//departmentDao.deleteOneDepartment(2);
		//List<Department> list = departmentDao.queryAllDepartment();
		//System.out.println(list);
		//List<Department> list = departmentDao.queryAllDepartment();
		//System.out.println(list);
		
		//feedbackFormDao.queryByUID(6);
		//feedbackFormDao.queryByUIDAndStatus(6);
		//trainDao.addTrain(new Train(1,"12",new Date(),"hujia"));
		//trainDao.updateTrain(new Train(1,"13",new Date(),"hujia"));
		//trainDao.deleteTrain(1);	
		//trainDao.queryAllTrain();
		
	}
	
	@Test
	public void test2() {
		//positionDao.addPosition(new Position(-1,"炮灰",2));
		//positionDao.deletePosition(1);
		/*List<Position> list = positionDao.queryAll();
		System.out.println(list);
		List<Position> queryByDepartment = positionDao.queryByDepartment(3);
		System.out.println(queryByDepartment);
		positionDao.updatePosition(new Position(3,"炮     灰",2));*/
		ApplicationForm a = new ApplicationForm();
		a.setDate(new Date());
		applicationFormDao.updateInterviewStatus(1);
		
	}
	
	
	@Test
	public void test3() {
		/*prizeInfoDao.addPrizeInfo(new PrizeInfo(-1,1,"1","1",new Date(),10000,"2"));
		prizeInfoDao.deletePrizeInfo(1);
		prizeInfoDao.queryByEId(1);
		prizeInfoDao.updatePrizeInfo(new PrizeInfo(1,1,"1","1",new Date(),100,"2"));*/
		//salaryDao.addSalary(new Salary());
		//salaryDao.queryAll();
		//salaryDao.queryByDate(new Date());
		//salaryDao.queryByEId(1);
		//wageDiscrepancyDao.addWageDiscrepancy(new WageDiscrepancy());
		wageDiscrepancyDao.deleteWageDiscrepancy(1);
		wageDiscrepancyDao.queryAllWageDiscrepancy();
	}
	@Test
	public void test4() {
		wageDiscrepancyDao.queryOneWageDiscrepancy(2, new Date());
	}
}

package com.iotek.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iotek.dao.DepartmentDao;
import com.iotek.dao.PositionDao;
import com.iotek.dao.ResumeDao;
import com.iotek.dao.UserDao;

import comiotek.entity.Department;
import comiotek.entity.Position;
import comiotek.entity.Resume;
import comiotek.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mvc.xml", "classpath:spring-mybatis.xml", "classpath:spring.xml"})
public class YouKnow {
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private ResumeDao resumeDao;
	
	@Autowired
	private DepartmentDao departmentDao;
	@Autowired
	private PositionDao positionDao;
	
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
		List<Department> list = departmentDao.queryAllDepartment();
		System.out.println(list);
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
	}
	
}

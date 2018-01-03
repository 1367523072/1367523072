package com.iotek.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iotek.dao.ResumeDao;
import com.iotek.dao.UserDao;

import comiotek.entity.Resume;
import comiotek.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mvc.xml", "classpath:spring-mybatis.xml", "classpath:spring.xml"})
public class YouKnow {
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private ResumeDao resumeDao;
	
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
		/*int j = resumeDao.updateResume(new Resume(1,"1",2,1,"1","1","1","1","1","1","1","1","1"));
		System.out.println(j);*/
	}
}

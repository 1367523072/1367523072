package com.iotek.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.dao.EmployeeDao;
import com.iotek.entity.Employee;
import com.iotek.entity.Resume;
import com.iotek.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDao employeeDao;
	@Override
	public int update(Resume resume,int userId) {
		return employeeDao.update(resume,userId);
	}

	@Override
	public int del(int id) {
		return employeeDao.del(id);
	}

	@Override
	public Employee query(int userId) {
		return employeeDao.query(userId);
	}

	@Override
	public int addEmployee(int userId, Date date) {
		return employeeDao.addEmployee(userId, date);
	}

	@Override
	public List<Employee> queryAll() {
		return employeeDao.queryAll();
	}

	@Override
	public Employee queryById(int id) {
		return employeeDao.queryById(id);
	}

}

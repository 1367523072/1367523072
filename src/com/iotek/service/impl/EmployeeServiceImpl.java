package com.iotek.service.impl;

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

}

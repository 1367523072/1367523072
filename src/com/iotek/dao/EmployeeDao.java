package com.iotek.dao;

import java.util.Date;
import java.util.List;

import com.iotek.entity.Employee;
import com.iotek.entity.Resume;

public interface EmployeeDao {
	//修改信息
	public int update(Resume resume,int userId);
	//开除
	public int del(int id);
	//查看
	public Employee query(int userId);
	//查看
	public Employee queryById(int id);
	//添加
	public int addEmployee(int userId,Date date);
	//查看所有
	public List<Employee> queryAll();
}

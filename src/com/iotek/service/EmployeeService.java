package com.iotek.service;

import com.iotek.entity.Employee;
import com.iotek.entity.Resume;

public interface EmployeeService {
	//修改信息
	public int update(Resume resume,int userId);
	//开除
	public int del(int id);
	//查看
	public Employee query(int userId);
}

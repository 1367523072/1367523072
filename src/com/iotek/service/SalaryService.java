package com.iotek.service;

import java.util.Date;
import java.util.List;

import com.iotek.entity.Salary;

public interface SalaryService {
	//根据date查询工资
	public List<Salary> queryByDate(Date date);
	//根据eId查询工资
	public List<Salary> queryByEId(int userId);
	//查询所有工资条
	public List<Salary> queryAll();
	//添加工资条
	public int addSalary(Salary salary);
}

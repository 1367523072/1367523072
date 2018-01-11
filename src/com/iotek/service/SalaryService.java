package com.iotek.service;

import java.util.Date;
import java.util.List;

import com.iotek.entity.Salary;

public interface SalaryService {
	//����date��ѯ����
	public List<Salary> queryByDate(Date date);
	//����eId��ѯ����
	public List<Salary> queryByEId(int userId);
	//��ѯ���й�����
	public List<Salary> queryAll();
	//��ӹ�����
	public int addSalary(Salary salary);
}

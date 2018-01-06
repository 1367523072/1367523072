package com.iotek.dao;

import java.util.Date;
import java.util.List;

import com.iotek.entity.Salary;

public interface SalaryDao {
	//����date��ѯ����
	public List<Salary> queryByDate(Date date);
	//����eId��ѯ����
	public List<Salary> queryByEId(int eId);
	//��ѯ���й�����
	public List<Salary> queryAll();
	//��ӹ�����
	public int addSalary(Salary salary);
}

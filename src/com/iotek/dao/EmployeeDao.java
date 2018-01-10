package com.iotek.dao;

import java.util.Date;
import java.util.List;

import com.iotek.entity.Employee;
import com.iotek.entity.Resume;

public interface EmployeeDao {
	//�޸���Ϣ
	public int update(Resume resume,int userId);
	//����
	public int del(int id);
	//�鿴
	public Employee query(int userId);
	//�鿴
	public Employee queryById(int id);
	//���
	public int addEmployee(int userId,Date date);
	//�鿴����
	public List<Employee> queryAll();
}

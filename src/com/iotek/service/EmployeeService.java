package com.iotek.service;

import com.iotek.entity.Employee;
import com.iotek.entity.Resume;

public interface EmployeeService {
	//�޸���Ϣ
	public int update(Resume resume,int userId);
	//����
	public int del(int id);
	//�鿴
	public Employee query(int userId);
}

package com.iotek.dao;

import com.iotek.entity.Employee;
import com.iotek.entity.Resume;

public interface EmployeeDao {
	//�޸���Ϣ
	public int update(Resume resume,int userId);
	//����
	public int del(int id);
	//�鿴
	public Employee query(int userId);
}

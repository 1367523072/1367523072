package com.iotek.dao;

import java.util.List;

import comiotek.entity.Department;

public interface DepartmentDao {
	//�鿴���в���
	public List<Department> queryAllDepartment();
	//�鿴һ������
	public Department queryOneDepartment(int id);
	//���Ӳ���
	public int addOneDepartment(Department department);
	//ɾ������
	public int deleteOneDepartment(int id);
	//�޸Ĳ���
	public int updateOneDepartment(int id,String name);
}

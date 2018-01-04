package com.iotek.service;

import java.util.List;

import comiotek.entity.Department;

public interface DepartmentService {
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

package com.iotek.service;

import java.util.List;

import comiotek.entity.Department;

public interface DepartmentService {
		//查看所有部门
		public List<Department> queryAllDepartment();
		//查看一个部门
		public Department queryOneDepartment(int id);
		//增加部门
		public int addOneDepartment(Department department);
		//删除部门
		public int deleteOneDepartment(int id);
		//修改部门
		public int updateOneDepartment(int id,String name);
}

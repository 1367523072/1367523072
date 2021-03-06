package com.iotek.dao;

import java.util.List;

import com.iotek.entity.Department;

public interface DepartmentDao {
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

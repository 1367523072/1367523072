package com.iotek.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.dao.DepartmentDao;
import com.iotek.service.DepartmentService;

import comiotek.entity.Department;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentDao departmentDao;
	@Override
	public List<Department> queryAllDepartment() {
		return departmentDao.queryAllDepartment();
	}

	@Override
	public Department queryOneDepartment(int id) {
		return departmentDao.queryOneDepartment(id);
	}

	@Override
	public int addOneDepartment(Department department) {
		return departmentDao.addOneDepartment(department);
	}

	@Override
	public int deleteOneDepartment(int id) {
		return departmentDao.deleteOneDepartment(id);
	}

	@Override
	public int updateOneDepartment(int id, String name) {
		return departmentDao.updateOneDepartment(id, name);
	}

}

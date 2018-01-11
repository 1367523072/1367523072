package com.iotek.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.dao.SalaryDao;
import com.iotek.entity.Salary;
import com.iotek.service.SalaryService;

@Service("salaryService")
public class SalaryServiceImpl implements SalaryService {
	
	@Autowired
	private SalaryDao salaryDao;
	@Override
	public List<Salary> queryByDate(Date date) {
		return salaryDao.queryByDate(date);
	}

	@Override
	public List<Salary> queryByEId(int userId) {
		return salaryDao.queryByEId(userId);
	}

	@Override
	public List<Salary> queryAll() {
		return salaryDao.queryAll();
	}

	@Override
	public int addSalary(Salary salary) {
		return salaryDao.addSalary(salary);
	}

	@Override
	public Salary queryByeIdDate(int eId, Date date) {
		return salaryDao.queryByeIdDate(eId, date);
	}

}

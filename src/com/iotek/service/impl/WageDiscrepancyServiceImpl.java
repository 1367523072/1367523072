package com.iotek.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.dao.WageDiscrepancyDao;
import com.iotek.service.WageDiscrepancyService;

import comiotek.entity.WageDiscrepancy;

@Service("wageDiscrepancyService")
public class WageDiscrepancyServiceImpl implements WageDiscrepancyService {
	@Autowired
	private WageDiscrepancyDao wageDiscrepancyDao;
	
	@Override
	public int addWageDiscrepancy(WageDiscrepancy wageDiscrepancy) {
		return wageDiscrepancyDao.addWageDiscrepancy(wageDiscrepancy);
	}

	@Override
	public List<WageDiscrepancy> queryAllWageDiscrepancy() {
		return wageDiscrepancyDao.queryAllWageDiscrepancy();
	}

	@Override
	public int deleteWageDiscrepancy(int id) {
		return wageDiscrepancyDao.deleteWageDiscrepancy(id);
	}

}
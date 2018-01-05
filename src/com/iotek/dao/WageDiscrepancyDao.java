package com.iotek.dao;

import java.util.List;

import comiotek.entity.WageDiscrepancy;

public interface WageDiscrepancyDao {
	//添加异议
	public int addWageDiscrepancy(WageDiscrepancy wageDiscrepancy);
	//查看异议
	public List<WageDiscrepancy> queryAllWageDiscrepancy();
	//删除异议
	public int deleteWageDiscrepancy(int id);
}

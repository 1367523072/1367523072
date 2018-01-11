package com.iotek.service;

import java.util.Date;
import java.util.List;

import com.iotek.entity.WageDiscrepancy;

public interface WageDiscrepancyService {
	//添加异议
	public int addWageDiscrepancy(WageDiscrepancy wageDiscrepancy);
	//查看异议
	public List<WageDiscrepancy> queryAllWageDiscrepancy();
	//删除异议
	public int deleteWageDiscrepancy(int id);
	//根据日期和员工id来查看
	public WageDiscrepancy queryOneWageDiscrepancy(int id,Date date);
	//根据异议id来查看
	public WageDiscrepancy queryOne(int id);
}

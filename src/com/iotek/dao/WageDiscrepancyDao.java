package com.iotek.dao;

import java.util.List;

import comiotek.entity.WageDiscrepancy;

public interface WageDiscrepancyDao {
	//�������
	public int addWageDiscrepancy(WageDiscrepancy wageDiscrepancy);
	//�鿴����
	public List<WageDiscrepancy> queryAllWageDiscrepancy();
	//ɾ������
	public int deleteWageDiscrepancy(int id);
}

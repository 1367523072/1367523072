package com.iotek.service;

import java.util.Date;
import java.util.List;

import com.iotek.entity.WageDiscrepancy;

public interface WageDiscrepancyService {
	//�������
	public int addWageDiscrepancy(WageDiscrepancy wageDiscrepancy);
	//�鿴����
	public List<WageDiscrepancy> queryAllWageDiscrepancy();
	//ɾ������
	public int deleteWageDiscrepancy(int id);
	//�������ں�Ա��id���鿴
	public WageDiscrepancy queryOneWageDiscrepancy(int id,Date date);
	//��������id���鿴
	public WageDiscrepancy queryOne(int id);
}

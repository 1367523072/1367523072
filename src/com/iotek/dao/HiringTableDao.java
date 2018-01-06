package com.iotek.dao;

import java.util.List;

import com.iotek.entity.HiringTable;

public interface HiringTableDao {
	//�鿴����
	public List<HiringTable> queryAll(); 
	//�鿴һ��
	public HiringTable queryOne(int id);
	//ɾ��
	public int deleteHiringTable(int id);
	//����
	public int updateHiringTable(int id);
	//���
	public int addHiringTable(HiringTable HiringTable);
	
}

package com.iotek.service;

import java.util.List;

import com.iotek.entity.HiringTable;

public interface HiringTableService {
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

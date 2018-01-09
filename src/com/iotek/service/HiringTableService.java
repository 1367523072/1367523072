package com.iotek.service;

import java.util.List;

import com.iotek.entity.HiringTable;

public interface HiringTableService {
	//�鿴������Ƹ��Ϣ
	public List<HiringTable> queryAll(); 
	//�鿴һ����Ƹ��Ϣ
	public HiringTable queryOne(int id);
	//ɾ����Ƹ��Ϣ
	public int deleteHiringTable(int id);
	//������Ƹ��Ϣ
	public int updateHiringTable(int id);
	//�����Ƹ��Ϣ
	public int addHiringTable(HiringTable HiringTable);
}

package com.iotek.dao;

import java.util.List;

import comiotek.entity.PrizeInfo;

public interface PrizeInfoDao {
	//����eId ��ѯ��¼
	public List<PrizeInfo> queryByEId(int eId);
	//��Ӽ�¼
	public int addPrizeInfo(PrizeInfo prizeInfo);
	//�޸ļ�¼
	public int updatePrizeInfo(PrizeInfo prizeInfo);
	//ɾ��
	public int deletePrizeInfo(int id);
}

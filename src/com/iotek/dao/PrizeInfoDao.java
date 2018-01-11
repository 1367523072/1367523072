package com.iotek.dao;

import java.util.List;

import com.iotek.entity.PrizeInfo;

public interface PrizeInfoDao {
	//����eId ��ѯ��¼
	public List<PrizeInfo> queryByEId(int userId);
	//��Ӽ�¼
	public int addPrizeInfo(PrizeInfo prizeInfo);
	//�޸ļ�¼
	public int updatePrizeInfo(PrizeInfo prizeInfo);
	//ɾ��
	public int deletePrizeInfo(int id);
}

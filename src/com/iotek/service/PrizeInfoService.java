package com.iotek.service;

import java.util.List;

import com.iotek.entity.PrizeInfo;

public interface PrizeInfoService {
		//����eId ��ѯ��¼
		public List<PrizeInfo> queryByEId(int eId);
		//��Ӽ�¼
		public int addPrizeInfo(PrizeInfo prizeInfo);
		//�޸ļ�¼
		public int updatePrizeInfo(PrizeInfo prizeInfo);
		//ɾ��
		public int deletePrizeInfo(int id);
}

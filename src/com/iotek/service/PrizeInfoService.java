package com.iotek.service;

import java.util.List;

import com.iotek.entity.PrizeInfo;

public interface PrizeInfoService {
		//����eId ��ѯ���ͱ�
		public List<PrizeInfo> queryByEId(int userId);
		//��ӽ��ͱ�
		public int addPrizeInfo(PrizeInfo prizeInfo);
		//�޸Ľ��ͱ�
		public int updatePrizeInfo(PrizeInfo prizeInfo);
		//ɾ�����ͱ�
		public int deletePrizeInfo(int id);
}

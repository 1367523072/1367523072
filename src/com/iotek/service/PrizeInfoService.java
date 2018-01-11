package com.iotek.service;

import java.util.List;

import com.iotek.entity.PrizeInfo;

public interface PrizeInfoService {
		//根据eId 查询奖惩表
		public List<PrizeInfo> queryByEId(int userId);
		//添加奖惩表
		public int addPrizeInfo(PrizeInfo prizeInfo);
		//修改奖惩表
		public int updatePrizeInfo(PrizeInfo prizeInfo);
		//删除奖惩表
		public int deletePrizeInfo(int id);
}

package com.iotek.service;

import java.util.List;

import com.iotek.entity.PrizeInfo;

public interface PrizeInfoService {
		//根据eId 查询记录
		public List<PrizeInfo> queryByEId(int eId);
		//添加记录
		public int addPrizeInfo(PrizeInfo prizeInfo);
		//修改记录
		public int updatePrizeInfo(PrizeInfo prizeInfo);
		//删除
		public int deletePrizeInfo(int id);
}

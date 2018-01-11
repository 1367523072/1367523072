package com.iotek.dao;

import java.util.List;

import com.iotek.entity.PrizeInfo;

public interface PrizeInfoDao {
	//根据eId 查询记录
	public List<PrizeInfo> queryByEId(int userId);
	//添加记录
	public int addPrizeInfo(PrizeInfo prizeInfo);
	//修改记录
	public int updatePrizeInfo(PrizeInfo prizeInfo);
	//删除
	public int deletePrizeInfo(int id);
}

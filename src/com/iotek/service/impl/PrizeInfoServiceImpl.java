package com.iotek.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.dao.PrizeInfoDao;
import com.iotek.entity.PrizeInfo;
import com.iotek.service.PrizeInfoService;

@Service("prizeInfoService")
public class PrizeInfoServiceImpl implements PrizeInfoService {
	
	@Autowired
	private PrizeInfoDao prizeInfoDao;
	
	@Override
	public List<PrizeInfo> queryByEId(int userId) {
		return prizeInfoDao.queryByEId(userId);
	}

	@Override
	public int addPrizeInfo(PrizeInfo prizeInfo) {
		return prizeInfoDao.addPrizeInfo(prizeInfo);
	}

	@Override
	public int updatePrizeInfo(PrizeInfo prizeInfo) {
		return prizeInfoDao.updatePrizeInfo(prizeInfo);
	}

	@Override
	public int deletePrizeInfo(int id) {
		return prizeInfoDao.deletePrizeInfo(id);
	}

}

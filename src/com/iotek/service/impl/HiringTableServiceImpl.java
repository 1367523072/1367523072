package com.iotek.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.dao.HiringTableDao;
import com.iotek.entity.HiringTable;
import com.iotek.service.HiringTableService;

@Service("hiringTableService")
public class HiringTableServiceImpl implements HiringTableService {
	@Autowired
	private HiringTableDao hiringTableDao;
	@Override
	public List<HiringTable> queryAll() {
		return hiringTableDao.queryAll();
	}

	@Override
	public HiringTable queryOne(int id) {
		return hiringTableDao.queryOne(id);
	}

	@Override
	public int deleteHiringTable(int id) {
		return hiringTableDao.deleteHiringTable(id);
	}

	@Override
	public int updateHiringTable(HiringTable hiringTable) {
		return hiringTableDao.updateHiringTable(hiringTable);
	}

	@Override
	public int addHiringTable(HiringTable hiringTable) {
		return hiringTableDao.addHiringTable(hiringTable);
	}

}

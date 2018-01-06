package com.iotek.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.dao.PositionDao;
import com.iotek.entity.Position;
import com.iotek.service.PositionService;

@Service("positionService")
public class PositionServiceImpl implements PositionService {
	@Autowired
	private PositionDao positionDao;
	@Override
	public List<Position> queryAll() {
		return positionDao.queryAll();
	}

	@Override
	public List<Position> queryByDepartment(String depName) {
		return positionDao.queryByDepartment(depName);
	}

	@Override
	public int addPosition(Position position) {
		return positionDao.addPosition(position);
	}

	@Override
	public int deletePosition(int id) {
		return positionDao.deletePosition(id);
	}

	@Override
	public int updatePosition(Position position) {
		return positionDao.updatePosition(position);
	}

}

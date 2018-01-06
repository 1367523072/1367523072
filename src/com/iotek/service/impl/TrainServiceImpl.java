package com.iotek.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.dao.TrainDao;
import com.iotek.entity.Train;
import com.iotek.service.TrainService;

@Service("trainService")
public class TrainServiceImpl implements TrainService{
	@Autowired
	private TrainDao trainDao;
	@Override
	public int addTrain(Train train) {
		return trainDao.addTrain(train);
	}

	@Override
	public int updateTrain(Train train) {
		return trainDao.updateTrain(train);
	}

	@Override
	public int deleteTrain(int id) {
		return trainDao.deleteTrain(id);
	}

	@Override
	public List<Train> queryAllTrain() {
		return trainDao.queryAllTrain();
	}

}

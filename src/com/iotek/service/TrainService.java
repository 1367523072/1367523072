package com.iotek.service;

import java.util.List;

import com.iotek.entity.Train;

public interface TrainService {
		//������ѵ
		public int addTrain(Train train);
		//�޸���ѵ
		public int updateTrain(Train train);
		//ɾ����ѵ
		public int deleteTrain(int id);
		//�鿴������ѵ
		public List<Train> queryAllTrain();
}

package com.iotek.dao;

import java.util.List;

import comiotek.entity.Train;

public interface TrainDao {
	//������ѵ
	public int addTrain(Train train);
	//�޸���ѵ
	public int updateTrain(Train train);
	//ɾ����ѵ
	public int deleteTrain(int id);
	//�鿴������ѵ
	public List<Train> queryAllTrain();
}

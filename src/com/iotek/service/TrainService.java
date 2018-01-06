package com.iotek.service;

import java.util.List;

import com.iotek.entity.Train;

public interface TrainService {
		//增加培训
		public int addTrain(Train train);
		//修改培训
		public int updateTrain(Train train);
		//删除培训
		public int deleteTrain(int id);
		//查看所有培训
		public List<Train> queryAllTrain();
}

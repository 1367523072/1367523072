package com.iotek.service;

import java.util.Date;
import java.util.List;

import com.iotek.entity.Attendance;
import com.iotek.entity.User;

public interface AttendanceService {
		//�鿴���п���
		public List<Attendance> queryAll();
		//�鿴ĳ�˿���
		public List<Attendance> queryOneAll(int userId);
		//��ӿ���
		public int addAttendance(int userId,String uName,Date date);
		//����°��¼
		public int addClosingTime(int id,Date date);
}

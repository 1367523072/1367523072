package com.iotek.service;

import java.util.List;

import comiotek.entity.Attendance;

public interface AttendanceService {
		//�鿴���п���
		public List<Attendance> queryAll();
		//�鿴ĳ�˿���
		public List<Attendance> queryOneAll(String uName);
		//�鿴ĳ��ĳ��ĳ�¿���
		public List<Attendance> queryOneMonth(String uName,int year,int month);
		//�鿴ĳ��ĳ�꿼��
		public List<Attendance> queryOneYear(String uName,int year);
}

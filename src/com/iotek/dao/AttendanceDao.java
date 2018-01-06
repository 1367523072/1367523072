package com.iotek.dao;

import java.util.List;

import com.iotek.entity.Attendance;

public interface AttendanceDao {
	//�鿴���п���
	public List<Attendance> queryAll();
	//�鿴ĳ�˿���
	public List<Attendance> queryOneAll(String uName);
	//�鿴ĳ��ĳ��ĳ�¿���
	public List<Attendance> queryOneMonth(String uName,int year,int month);
	//�鿴ĳ��ĳ�꿼��
	public List<Attendance> queryOneYear(String uName,int year);
}

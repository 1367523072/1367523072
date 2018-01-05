package com.iotek.service;

import java.util.List;

import comiotek.entity.Attendance;

public interface AttendanceService {
		//查看所有考勤
		public List<Attendance> queryAll();
		//查看某人考勤
		public List<Attendance> queryOneAll(String uName);
		//查看某人某年某月考勤
		public List<Attendance> queryOneMonth(String uName,int year,int month);
		//查看某人某年考勤
		public List<Attendance> queryOneYear(String uName,int year);
}

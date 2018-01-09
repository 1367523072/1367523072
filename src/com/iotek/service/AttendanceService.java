package com.iotek.service;

import java.util.Date;
import java.util.List;

import com.iotek.entity.Attendance;
import com.iotek.entity.User;

public interface AttendanceService {
		//查看所有考勤
		public List<Attendance> queryAll();
		//查看某人考勤
		public List<Attendance> queryOneAll(int userId);
		//添加考勤
		public int addAttendance(int userId,String uName,Date date);
		//添加下班记录
		public int addClosingTime(int id,Date date);
}

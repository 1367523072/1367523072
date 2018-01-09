package com.iotek.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.dao.AttendanceDao;
import com.iotek.entity.Attendance;
import com.iotek.entity.User;
import com.iotek.service.AttendanceService;

@Service("attendanceService")
public class AttendanceServiceImpl implements AttendanceService {
	@Autowired
	private AttendanceDao attendanceDao;
	@Override
	public List<Attendance> queryAll() {
		return attendanceDao.queryAll();
	}

	@Override
	public List<Attendance> queryOneAll(int userId) {
		return attendanceDao.queryOneAll(userId);
	}

	@Override
	public int addAttendance(int userId,String uName,Date date) {
		return attendanceDao.addAttendance(userId, uName, date);
	}

	@Override
	public int addClosingTime(int id, Date date) {
		return attendanceDao.addClosingTime(id, date);
	}

	

}

package com.iotek.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.dao.AttendanceDao;
import com.iotek.service.AttendanceService;

import comiotek.entity.Attendance;

@Service("attendanceService")
public class AttendanceServiceImpl implements AttendanceService {
	@Autowired
	private AttendanceDao attendanceDao;
	@Override
	public List<Attendance> queryAll() {
		return attendanceDao.queryAll();
	}

	@Override
	public List<Attendance> queryOneAll(String uName) {
		return attendanceDao.queryOneAll(uName);
	}

	@Override
	public List<Attendance> queryOneMonth(String uName, int year, int month) {
		return attendanceDao.queryOneMonth(uName, year, month);
	}

	@Override
	public List<Attendance> queryOneYear(String uName, int year) {
		return attendanceDao.queryOneYear(uName, year);
	}

	

}

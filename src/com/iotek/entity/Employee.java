package com.iotek.entity;

import java.util.Date;
import java.util.List;

public class Employee {
	//id 简历 部门职位，相关培训信息，入职时间，薪资，奖惩信息，考勤记录 是否离职
	private int id;
	private int userId;
	private Resume resume;
	private List<Salary> salarys;
	private List<PrizeInfo> prizeInfos;
	private Date date;
	private List<Attendance> attendances;
	private int status = 0 ;//0 在职  1离职
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Resume getResume() {
		return resume;
	}
	public void setResume(Resume resume) {
		this.resume = resume;
	}
	
	public List<PrizeInfo> getPrizeInfos() {
		return prizeInfos;
	}
	public void setPrizeInfos(List<PrizeInfo> prizeInfos) {
		this.prizeInfos = prizeInfos;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<Attendance> getAttendances() {
		return attendances;
	}
	public void setAttendances(List<Attendance> attendances) {
		this.attendances = attendances;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Employee() {
		super();
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public List<Salary> getSalarys() {
		return salarys;
	}
	public void setSalarys(List<Salary> salarys) {
		this.salarys = salarys;
	}
	public Employee(int id, int userId, Resume resume, List<Salary> salarys,
			List<PrizeInfo> prizeInfos, Date date, List<Attendance> attendances, int status) {
		super();
		this.id = id;
		this.userId = userId;
		this.resume = resume;
		this.salarys = salarys;
		this.prizeInfos = prizeInfos;
		this.date = date;
		this.attendances = attendances;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", userId=" + userId + ", resume=" + resume + ", salarys="
				+ salarys + ", prizeInfos=" + prizeInfos + ", date=" + date + ", attendances=" + attendances
				+ ", status=" + status + "]";
	}
}

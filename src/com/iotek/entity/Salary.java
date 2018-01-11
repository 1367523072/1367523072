package com.iotek.entity;

import java.util.Date;

public class Salary {
	private int id;
	private int userId;
	private String eName;
	private int total;
	private int basePay = 6000;//基本工资
	private int meritPay;//绩效工资
	private int overtimeWage = 0;//加班工资
	private int rewardsPunishmentsWages;//奖惩工资
	private int socialSecurity = -500;//社保
	private Date date;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getTotal() {
		this.total = basePay+meritPay+overtimeWage+rewardsPunishmentsWages+socialSecurity;
		return total;
	}
	public int getBasePay() {
		return basePay;
	}
	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}
	public int getMeritPay() {
		return meritPay;
	}
	public void setMeritPay(int meritPay) {
		this.meritPay = meritPay;
	}
	public int getOvertimeWage() {
		return overtimeWage;
	}
	public void setOvertimeWage(int overtimeWage) {
		this.overtimeWage = overtimeWage;
	}
	
	public int getRewardsPunishmentsWages() {
		return rewardsPunishmentsWages;
	}
	public void setRewardsPunishmentsWages(int rewardsPunishmentsWages) {
		this.rewardsPunishmentsWages = rewardsPunishmentsWages;
	}
	public int getSocialSecurity() {
		return socialSecurity;
	}
	public void setSocialSecurity(int socialSecurity) {
		this.socialSecurity = socialSecurity;
	}
	@Override
	public String toString() {
		return "Salary [id=" + id + ", userId=" + userId + ", eName=" + eName + ", total=" + total + ", basePay=" + basePay
				+ ", meritPay=" + meritPay + ", overtimeWage=" + overtimeWage + ", rewardsPunishmentsWages="
				+ rewardsPunishmentsWages + ", socialSecurity=" + socialSecurity + ", date=" + date + "]";
	}
	public Salary(int id, int userId, String eName, int total, int basePay, int meritPay, int overtimeWage,
			int rewardsPunishmentsWages, int socialSecurity, Date date) {
		super();
		this.id = id;
		this.userId = userId;
		this.eName = eName;
		this.total = total;
		this.basePay = basePay;
		this.meritPay = meritPay;
		this.overtimeWage = overtimeWage;
		this.rewardsPunishmentsWages = rewardsPunishmentsWages;
		this.socialSecurity = socialSecurity;
		this.date = date;
	}
	public Salary() {
		super();
	}
	public Salary(int userId, String eName, int basePay, int meritPay, int overtimeWage, int rewardsPunishmentsWages,
			int socialSecurity, Date date) {
		super();
		this.userId = userId;
		this.eName = eName;
		this.basePay = basePay;
		this.meritPay = meritPay;
		this.overtimeWage = overtimeWage;
		this.rewardsPunishmentsWages = rewardsPunishmentsWages;
		this.socialSecurity = socialSecurity;
		this.date = date;
	}
}

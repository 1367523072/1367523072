package com.iotek.entity;

import java.util.Date;

//反馈表
public class FeedbackForm {
	private int id;
	private int uId;//游客的id；
	private Date date;//应聘表的date
	private String status = "未查看";
	private String interviewStatus = "按时面试";
	private Date interviewTime;//面试时间
	private String hiring = "未录用";
	public Date getInterviewTime() {
		return interviewTime;
	}
	public void setInterviewTime(Date interviewTime) {
		this.interviewTime = interviewTime;
	}
	public String getHiring() {
		return hiring;
	}
	public void setHiring(String hiring) {
		this.hiring = hiring;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getInterviewStatus() {
		return interviewStatus;
	}
	public void setInterviewStatus(String interviewStatus) {
		this.interviewStatus = interviewStatus;
	}
	public FeedbackForm() {
		super();
	}
	public FeedbackForm(int id, int uId, Date date, String status, String interviewStatus, Date interviewTime,
			String hiring) {
		super();
		this.id = id;
		this.uId = uId;
		this.date = date;
		this.status = status;
		this.interviewStatus = interviewStatus;
		this.interviewTime = interviewTime;
		this.hiring = hiring;
	}
	@Override
	public String toString() {
		return "FeedbackForm [id=" + id + ", uId=" + uId + ", date=" + date + ", status=" + status
				+ ", interviewStatus=" + interviewStatus + ", interviewTime=" + interviewTime + ", hiring=" + hiring
				+ "]";
	}
}

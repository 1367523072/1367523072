package com.iotek.entity;

import java.util.Date;

//½±³Í±í
public class PrizeInfo {
	private int id;
	private int userId;
	private String eName;
	private String reason;
	private Date date;
	private int amount;//½ð¶î
	private String type;//½±Àø»ò³Í·£
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
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public PrizeInfo() {
		super();
	}
	public PrizeInfo(int id, int userId, String eName, String reason, Date date, int amount, String type) {
		super();
		this.id = id;
		this.userId = userId;
		this.eName = eName;
		this.reason = reason;
		this.date = date;
		this.amount = amount;
		this.type = type;
	}
	@Override
	public String toString() {
		return "PrizeInfo [id=" + id + ", userId=" + userId + ", eName=" + eName + ", reason=" + reason + ", date=" + date
				+ ", amount=" + amount + ", type=" + type + "]";
	}
}

package com.iotek.entity;

//’–∆∏–≈œ¢
public class HiringTable {
	private int id;
	private String dept;
	private String position;
	public HiringTable(String dept, String position, String status) {
		super();
		this.dept = dept;
		this.position = position;
		this.status = status;
	}
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public HiringTable() {
		super();
	}
	public HiringTable(int id, String dept, String position, String status) {
		super();
		this.id = id;
		this.dept = dept;
		this.position = position;
		this.status = status;
	}
	@Override
	public String toString() {
		return "HiringTable [id=" + id + ", dept=" + dept + ", position=" + position + ", status=" + status + "]";
	}
}

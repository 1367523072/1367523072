package com.iotek.entity;

public class User {
	private int id;
	private String name;
	private String password;
	private int status=0;//0 = 游客    1 = 管理员   2 = 员工    3 = 部门主管  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public User() {
		super();
	}
	public User(int id, String name, String password, int status) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.status = status;
	}
	
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", status=" + status + "]";
	}
}

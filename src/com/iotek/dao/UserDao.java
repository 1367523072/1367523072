package com.iotek.dao;

import comiotek.entity.User;

public interface UserDao {
	//游客注册
	public int insert(User user);
	//删除游客
	public int del(int id);
	//查询游客
	public User query(String name);
	//修改密码
	public int changePassword(String password,int id);
}

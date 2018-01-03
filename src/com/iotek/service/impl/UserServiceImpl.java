package com.iotek.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.dao.UserDao;
import com.iotek.service.UserService;

import comiotek.entity.User;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public int add(User user) {
		return userDao.insert(user);
	}

	@Override
	public int delete(int id) {
		return userDao.del(id);
	}

	@Override
	public User find(String name) {
		return userDao.query(name);
	}

	@Override
	public int changePassword(String password,int id) {
		return userDao.changePassword(password,id);
	}
	
}

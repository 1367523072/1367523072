package com.iotek.dao;

import comiotek.entity.User;

public interface UserDao {
	//�ο�ע��
	public int insert(User user);
	//ɾ���ο�
	public int del(int id);
	//��ѯ�ο�
	public User query(String name);
	//�޸�����
	public int changePassword(String password,int id);
}

package com.iotek.service;

import comiotek.entity.User;

public interface UserService {
	
		//�ο�ע��
		public int add(User user);
		//ɾ���ο�
		public int delete(int id);
		//��ѯ�ο�
		public User find(String name);
		//�޸�����
		public int changePassword(String password,int id);
		
}

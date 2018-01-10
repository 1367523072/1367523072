package com.iotek.service;

import com.iotek.entity.User;

public interface UserService {
	
		//游客注册
		public int add(User user);
		//删除游客
		public int delete(int id);
		//查询游客
		public User find(String name);
		//修改密码
		public int changePassword(String password,int id);
		//更改员工状态
		public int changeStatus(int id);
		
}

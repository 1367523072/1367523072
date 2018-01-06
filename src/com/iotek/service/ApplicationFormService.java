package com.iotek.service;

import java.util.List;

import com.iotek.entity.ApplicationForm;

public interface ApplicationFormService {
		//查看所有应聘表
		public List<ApplicationForm> queryAllApplicationForm();
		//删除应聘表
		public int deleteApplicationForm(int id);
		//改查看状态
		public int updateStatus(int id);
		//改面试状态
		public int updateInterviewStatus(int id);
		//添加应聘表
		public int addApplicationForm(ApplicationForm applicationForm);
}

package com.iotek.service;

import java.util.List;

import comiotek.entity.ApplicationForm;

public interface ApplicationFormService {
		//查看所有应聘表
		public List<ApplicationForm> queryAllApplicationForm();
		//删除应聘表
		public int deleteApplicationForm(int id);
}

package com.iotek.dao;

import java.util.List;

import comiotek.entity.ApplicationForm;

public interface ApplicationFormDao {
	//�鿴����ӦƸ��
	public List<ApplicationForm> queryAllApplicationForm();
	//ɾ��ӦƸ��
	public int deleteApplicationForm(int id);
}

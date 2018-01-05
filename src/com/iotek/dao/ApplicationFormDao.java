package com.iotek.dao;

import java.util.List;

import comiotek.entity.ApplicationForm;

public interface ApplicationFormDao {
	//�鿴����ӦƸ��
	public List<ApplicationForm> queryAllApplicationForm();
	//ɾ��ӦƸ��
	public int deleteApplicationForm(int id);
	//�Ĳ鿴״̬
	public int updateStatus(int id);
	//������״̬
	public int updateInterviewStatus(int id);
	//���ӦƸ��
	public int addApplicationForm(ApplicationForm applicationForm);
}

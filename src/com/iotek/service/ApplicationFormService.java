package com.iotek.service;

import java.util.List;

import comiotek.entity.ApplicationForm;

public interface ApplicationFormService {
		//�鿴����ӦƸ��
		public List<ApplicationForm> queryAllApplicationForm();
		//ɾ��ӦƸ��
		public int deleteApplicationForm(int id);
}

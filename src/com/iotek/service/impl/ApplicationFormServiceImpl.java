package com.iotek.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.dao.ApplicationFormDao;
import com.iotek.service.ApplicationFormService;

import comiotek.entity.ApplicationForm;

@Service("applicationFormService")
public class ApplicationFormServiceImpl implements ApplicationFormService {
	
	@Autowired
	private ApplicationFormDao applicationFormDao;
	@Override
	public List<ApplicationForm> queryAllApplicationForm() {
		return applicationFormDao.queryAllApplicationForm();
	}

	@Override
	public int deleteApplicationForm(int id) {
		return applicationFormDao.deleteApplicationForm(id);
	}

	@Override
	public int updateStatus(int id) {
		return applicationFormDao.updateStatus(id);
	}

	@Override
	public int updateInterviewStatus(int id) {
		return applicationFormDao.updateInterviewStatus(id);
	}

	@Override
	public int addApplicationForm(ApplicationForm applicationForm) {
		return applicationFormDao.addApplicationForm(applicationForm);
	}

}

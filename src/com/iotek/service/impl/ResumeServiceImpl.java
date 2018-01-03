package com.iotek.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.dao.ResumeDao;
import com.iotek.service.ResumeService;

import comiotek.entity.Resume;

@Service("resumeService")
public class ResumeServiceImpl implements ResumeService {
	@Autowired
	private ResumeDao resumeDao;
	@Override
	public int addResume(Resume resume) {
		return resumeDao.addResume(resume);
	}

	@Override
	public int updateResume(Resume resume) {
		return resumeDao.updateResume(resume);
	}

}

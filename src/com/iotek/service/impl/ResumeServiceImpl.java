package com.iotek.service.impl;

import java.util.List;

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

	@Override
	public List<Resume> queryAll() {
		return resumeDao.queryAll();
	}

	@Override
	public Resume queryOne(int id) {
		return resumeDao.queryOne(id);
	}

	@Override
	public Resume queryOneByUserId(int userId) {
		return resumeDao.queryOneByUserId(userId);
	}

}

package com.iotek.dao;

import comiotek.entity.Resume;

public interface ResumeDao {
	//添加简历
	public int addResume(Resume resume);
	//修改简历
	public int updateResume(Resume resume);
}

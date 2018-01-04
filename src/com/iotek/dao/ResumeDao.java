package com.iotek.dao;

import java.util.List;

import comiotek.entity.Resume;

public interface ResumeDao {
	//添加简历
	public int addResume(Resume resume);
	//修改简历
	public int updateResume(Resume resume);
	//查看所有简历
	public List<Resume> queryAll();
	//查看一份简历
	public Resume queryOne(int id);
	//查看一份简历
	public Resume queryOneByUserId(int userId);
}

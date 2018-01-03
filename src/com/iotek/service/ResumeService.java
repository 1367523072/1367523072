package com.iotek.service;

import comiotek.entity.Resume;

public interface ResumeService {
		//添加简历
		public int addResume(Resume resume);
		//修改简历
		public int updateResume(Resume resume);
}

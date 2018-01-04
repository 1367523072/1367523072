package com.iotek.service;

import java.util.List;

import comiotek.entity.Resume;

public interface ResumeService {
		//��Ӽ���
		public int addResume(Resume resume);
		//�޸ļ���
		public int updateResume(Resume resume);
		//�鿴���м���
		public List<Resume> queryAll();
		//�鿴һ�ݼ���
		public Resume queryOne(int id);
		//�鿴һ�ݼ���
		public Resume queryOneByUserId(int userId);
}

package com.iotek.dao;

import java.util.List;

import comiotek.entity.FeedbackForm;

public interface FeedbackFormDao {
	//����uId�鿴������
	public List<FeedbackForm> queryByUID(int uId);
	//����uId���Ƿ�鿴����ѯ������
	public List<FeedbackForm> queryByUIDAndStatus(int uId);
}

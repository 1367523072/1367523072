package com.iotek.service;

import java.util.List;

import comiotek.entity.FeedbackForm;

public interface FeedbackFormService {
		//����uId�鿴������
		public List<FeedbackForm> queryByUID(int uId);
		//����uId���Ƿ�鿴����ѯ������
		public List<FeedbackForm> queryByUIDAndStatus(int uId);
}

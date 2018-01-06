package com.iotek.dao;

import java.util.List;

import com.iotek.entity.FeedbackForm;

public interface FeedbackFormDao {
	//����uId�鿴������
	public List<FeedbackForm> queryByUID(int uId);
	//����uId���Ƿ�鿴����ѯ������
	public List<FeedbackForm> queryByUIDAndStatus(int uId);
	//��ӷ�����
	public int addFeedbackForm(FeedbackForm feedbackForm);
	//����¼��
	public int updateHiring(int uId);
	//���Ĳ鿴״̬
	public int updateStatus(int uId);
	//�Ѳ鿴�ķ�����
	public List<FeedbackForm> query(int uId);
}

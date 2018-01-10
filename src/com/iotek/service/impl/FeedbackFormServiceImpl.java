package com.iotek.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.dao.FeedbackFormDao;
import com.iotek.entity.FeedbackForm;
import com.iotek.service.FeedbackFormService;

@Service("feedbackFormService")
public class FeedbackFormServiceImpl implements FeedbackFormService {
	
	@Autowired
	private FeedbackFormDao feedbackFormDao;
	@Override
	public List<FeedbackForm> queryByUID(int uId) {
		return feedbackFormDao.queryByUID(uId);
	}

	@Override
	public List<FeedbackForm> queryByUIDAndStatus(int uId) {
		return feedbackFormDao.queryByUIDAndStatus(uId);
	}

	@Override
	public int addFeedbackForm(FeedbackForm feedbackForm) {
		return feedbackFormDao.addFeedbackForm(feedbackForm);
	}

	@Override
	public int updateHiring(int uId) {
		return feedbackFormDao.updateHiring(uId);
	}

	@Override
	public int updateStatus(int uId) {
		return feedbackFormDao.updateStatus(uId);
	}

	@Override
	public List<FeedbackForm> query(int uId) {
		return feedbackFormDao.query(uId);
	}

	@Override
	public List<FeedbackForm> queryAll() {
		return feedbackFormDao.queryAll();
	}

	@Override
	public int del(int uId) {
		return feedbackFormDao.del(uId);
	}

}

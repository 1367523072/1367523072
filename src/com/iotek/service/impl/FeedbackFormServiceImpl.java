package com.iotek.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.dao.FeedbackFormDao;
import com.iotek.service.FeedbackFormService;

import comiotek.entity.FeedbackForm;

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

}

package com.iotek.service;

import java.util.List;

import comiotek.entity.FeedbackForm;

public interface FeedbackFormService {
		//根据uId查看反馈表
		public List<FeedbackForm> queryByUID(int uId);
		//根据uId和是否查看来查询反馈表
		public List<FeedbackForm> queryByUIDAndStatus(int uId);
}

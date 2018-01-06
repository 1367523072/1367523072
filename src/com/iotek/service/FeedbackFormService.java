package com.iotek.service;

import java.util.List;

import com.iotek.entity.FeedbackForm;

public interface FeedbackFormService {
		//根据uId查看反馈表
		public List<FeedbackForm> queryByUID(int uId);
		//根据uId和是否查看来查询反馈表
		public List<FeedbackForm> queryByUIDAndStatus(int uId);
		//添加反馈表
		public int addFeedbackForm(FeedbackForm feedbackForm);
		//更改录用
		public int updateHiring(int uId);
		//更改查看状态
		public int updateStatus(int uId);
		//已查看的反馈表
		public List<FeedbackForm> query(int uId);
}

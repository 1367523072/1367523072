package com.iotek.entity;

public class Page {
	private int pageSize = 5;
	private int current;//��ǰҳ
	private int start;//��ѯ��ʼ��
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public int getStart() {
		this.start = (current-1) * pageSize;
		return start;
	}
}

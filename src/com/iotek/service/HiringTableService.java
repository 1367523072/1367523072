package com.iotek.service;

import java.util.List;

import com.iotek.entity.HiringTable;

public interface HiringTableService {
	//查看所有招聘信息
	public List<HiringTable> queryAll(); 
	//查看一个招聘信息
	public HiringTable queryOne(int id);
	//删除招聘信息
	public int deleteHiringTable(int id);
	//更新招聘信息
	public int updateHiringTable(int id);
	//添加招聘信息
	public int addHiringTable(HiringTable HiringTable);
}

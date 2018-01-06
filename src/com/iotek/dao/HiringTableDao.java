package com.iotek.dao;

import java.util.List;

import com.iotek.entity.HiringTable;

public interface HiringTableDao {
	//查看所有
	public List<HiringTable> queryAll(); 
	//查看一个
	public HiringTable queryOne(int id);
	//删除
	public int deleteHiringTable(int id);
	//更新
	public int updateHiringTable(int id);
	//添加
	public int addHiringTable(HiringTable HiringTable);
	
}

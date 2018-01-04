package com.iotek.dao;

import java.util.List;

import comiotek.entity.Position;

public interface PositionDao {
	//查看所有职位
	public List<Position> queryAll();
	//查看某一部门的职位
	public List<Position> queryByDepartment(String depName);
	//增加职位
	public int addPosition(Position position);
	//删除职位
	public int deletePosition(int id);
	//修改职位
	public int updatePosition(Position position);
}

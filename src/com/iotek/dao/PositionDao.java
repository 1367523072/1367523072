package com.iotek.dao;

import java.util.List;

import comiotek.entity.Position;

public interface PositionDao {
	//�鿴����ְλ
	public List<Position> queryAll();
	//�鿴ĳһ���ŵ�ְλ
	public List<Position> queryByDepartment(String depName);
	//����ְλ
	public int addPosition(Position position);
	//ɾ��ְλ
	public int deletePosition(int id);
	//�޸�ְλ
	public int updatePosition(Position position);
}

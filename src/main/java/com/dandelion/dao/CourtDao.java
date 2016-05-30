package com.dandelion.dao;

import java.util.List;

import com.dandelion.model.CourtEntity;

public interface CourtDao {
	public boolean addCourt(CourtEntity courtEntity);
	
	public boolean deleteCourt(CourtEntity courtEntity);
	
	/**
	 * 获取所有的场地信息
	 * @param courtEntity
	 * @return
	 */
	public List<CourtEntity> getAllCourt(CourtEntity courtEntity);
	
	public List<CourtEntity> findCourt(CourtEntity courtEntity);
	
	
}

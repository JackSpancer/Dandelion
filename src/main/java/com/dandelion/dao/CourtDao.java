package com.dandelion.dao;

import java.util.List;

import com.dandelion.model.CourtEntity;

public interface CourtDao {
	public boolean addCourt(CourtEntity courtEntity);
	
	public boolean deleteCourt(CourtEntity courtEntity);
	
	public List<CourtEntity> getAllCourt();
	
	public List<CourtEntity> findCourt(CourtEntity courtEntity);
	
	
}

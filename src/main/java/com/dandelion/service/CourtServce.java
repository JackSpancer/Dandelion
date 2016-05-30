package com.dandelion.service;

import java.util.List;

import com.dandelion.model.CourtEntity;

public interface CourtServce {
	
public boolean addCourt(CourtEntity courtEntity);
	
	public boolean deleteCourt(CourtEntity courtEntity);
	
	public List<CourtEntity> getAllCourt();
	
	public List<CourtEntity> findCourt(CourtEntity courtEntity);
}

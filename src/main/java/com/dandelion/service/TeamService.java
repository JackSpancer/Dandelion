package com.dandelion.service;

import java.util.List;

import com.dandelion.model.TeamEntity;

public interface TeamService {

	public boolean addTeam(TeamEntity teamEntity);

	public boolean deleteTeam(TeamEntity teamEntity);
	
	public List<TeamEntity> getAllTeam();
}

package com.dandelion.dao;

import java.util.List;

import com.dandelion.model.TeamEntity;

public interface TeamDao {

	public boolean addTeam(TeamEntity tEntity);

	public boolean deleteTeam(TeamEntity tEntity);

	public List<TeamEntity> getAllTeam();
}

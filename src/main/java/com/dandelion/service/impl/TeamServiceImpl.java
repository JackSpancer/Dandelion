package com.dandelion.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dandelion.dao.TeamDao;
import com.dandelion.model.TeamEntity;
import com.dandelion.service.TeamService;

@Transactional
@Service("teamService")
public class TeamServiceImpl implements TeamService {

	@Resource
	private TeamDao teamDao;

	@Override
	public boolean addTeam(TeamEntity teamEntity) {
		return teamDao.addTeam(teamEntity);
	}

	@Override
	public boolean deleteTeam(TeamEntity teamEntity) {
		return teamDao.deleteTeam(teamEntity);
	}

	@Override
	public List<TeamEntity> getAllTeam() {
		return teamDao.getAllTeam();
	}

}

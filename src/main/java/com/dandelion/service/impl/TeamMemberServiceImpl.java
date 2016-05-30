package com.dandelion.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dandelion.dao.TeamMemberDao;
import com.dandelion.model.TeamMemberEntity;
import com.dandelion.service.TeamMemberService;

@Transactional
@Service("TeamMemberService")
public class TeamMemberServiceImpl implements TeamMemberService {

	@Resource
	private TeamMemberDao teamMemberDao;

	@Override
	public boolean addMember(TeamMemberEntity team) {
		return teamMemberDao.addMember(team);
	}

	@Override
	public boolean deleteMember(TeamMemberEntity team) {
		return teamMemberDao.deleteMember(team);
	}
}

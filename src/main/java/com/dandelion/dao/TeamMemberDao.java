package com.dandelion.dao;

import com.dandelion.model.TeamMemberEntity;

public interface TeamMemberDao {

	public boolean addMember(TeamMemberEntity team);

	public boolean deleteMember(TeamMemberEntity team);
}

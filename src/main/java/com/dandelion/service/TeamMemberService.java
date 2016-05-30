package com.dandelion.service;

import com.dandelion.model.TeamMemberEntity;

public interface TeamMemberService {

	public boolean addMember(TeamMemberEntity team);

	public boolean deleteMember(TeamMemberEntity team);
}

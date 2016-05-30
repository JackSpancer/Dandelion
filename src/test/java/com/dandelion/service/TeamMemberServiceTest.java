package com.dandelion.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dandelion.model.TeamMemberEntity;

@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-hibernate.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TeamMemberServiceTest {

	@Resource
	private TeamMemberService teamMemberService;

	// @Test
	// public void testAddMember(){
	//
	// TeamMemberEntity teamMemberEntity = new TeamMemberEntity();
	// teamMemberEntity.setTeamid(14);
	// teamMemberEntity.setUserid(1);
	// teamMemberService.addMember(teamMemberEntity);
	// }

	@Test
	public void testDeleteMember() {
		TeamMemberEntity teamMemberEntity = new TeamMemberEntity();
		teamMemberEntity.setTeamid(14);
		teamMemberEntity.setUserid(1);
		teamMemberService.deleteMember(teamMemberEntity);
	}

}

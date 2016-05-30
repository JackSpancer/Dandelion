package com.dandelion.service;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dandelion.model.TeamEntity;

@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-hibernate.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TeamServieceTest {

	@Resource
	private TeamService teamService;

	// @Test
	// public void testAddTeam() {
	// Date date = new Date();
	// TeamEntity teamEntity = new TeamEntity("神奇", "chen", "fdsf", date,
	// "fsdaf", "15606009570");
	// // boolean istrue = teamDao.addTeam(teamEntity);
	// boolean istrue = teamService.addTeam(teamEntity);
	// System.out.println("是否添加成功" + istrue);
	// }
	//
	// @Test
	// public void testgetAllTeam() {
	// System.err.println("全部的队伍：");
	// System.out.println(teamService.getAllTeam());
	// }

	@Test
	public void testdeleteTeam() {
		TeamEntity t = new TeamEntity();
		t.setId(6);
		System.out.println(teamService.deleteTeam(t));
	}

}

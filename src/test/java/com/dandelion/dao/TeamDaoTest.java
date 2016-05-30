package com.dandelion.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.dandelion.model.TeamEntity;
import com.dandelion.model.UserEntity;

@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-hibernate.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
// defaultRollback=true不会改变数据库，false会改变数据库
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class TeamDaoTest {
	@Resource
	private TeamDao teamDao;

	@Test
	public void testIsExist() {
		Date date = new Date();
		TeamEntity teamEntity = new TeamEntity("fkjfkjfkfj", "chen", "fdsf", date,
				"fsdaf", "15606009570");
		boolean istrue = teamDao.addTeam(teamEntity);
		System.out.println("是否添加成功" + istrue);
	}
}

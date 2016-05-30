package com.dandelion.dao;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.dandelion.model.UserEntity;


@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-hibernate.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
// defaultRollback=true不会改变数据库，false会改变数据库
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class UserDaoTest {
	@Resource
	private UserDao userDao;

	@Test
	public void testIsExist() {
//		UserEntity user = new UserEntity("dfasd", "fdsafd", 1, new Date(), "1235435", new Date(), new Date(), 0, "dd");
		UserEntity user = new UserEntity("dfasd", "dfad", true, new Date(), "327482", new Date(), new Date(), true, "fdsf");
		boolean result = userDao.addUser(user);
		System.err.println(result);
	}
}

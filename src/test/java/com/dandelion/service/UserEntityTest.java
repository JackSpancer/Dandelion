package com.dandelion.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dandelion.model.UserEntity;
import com.dandelion.service.UserService;

@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-hibernate.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class UserEntityTest {

	@Resource
	private UserService userService;

	// @Test
	// public void testIsExist() {
	// UserEntity user = new UserEntity();
	// user.setUsername("chen");
	// user.setPassword("123");
	// boolean result = userService.isExist(user);
	// Logger logger = Logger.getLogger(UserEntity.class);
	// logger.info(result);
	// System.out.println("fdadfadf" + result);
	// }
	//
	// @Test
	// public void testaddExist() throws ParseException {
	// UserEntity user = new UserEntity();
	// user.setUsername("chen");
	// user.setPassword("123");
	// SimpleDateFormat mysiDateFormat = new SimpleDateFormat("yyyy-mm-dd");
	// Date date = null;
	// date = mysiDateFormat.parse("2000-01-01");
	// user.setRegtime(date);
	// user.setBirthDay(date);
	// user.setStartPlay(date);
	// System.out.println(user.getRegtime());
	// boolean result = userService.addUser(user);
	// Logger logger = Logger.getLogger(UserEntity.class);
	// logger.info(result);
	// System.out.println("fdadfadf" + result);
	// }
	//
	// @Test
	// public void testDeleteUser() {
	// UserEntity userEntity = new UserEntity();
	// userEntity.setMobile("15606009570");
	// userEntity.setSex(true);
	//
	// }

	 @Test
	 public void testAllUser() {
	 UserEntity user = new UserEntity();
	 user.setUsername("chen");
	 user.setPassword("123");
	 boolean result = userService.isExist(user);
	 Logger logger = Logger.getLogger(UserEntity.class);
	 logger.info(result);
	 System.out.println("fdadfadf" + result);
	 List<UserEntity> list = new ArrayList<UserEntity>();
	 // try {
	 list = userService.getAllUser();
	 userService.getAllUser();
	 // } catch (Throwable e) {
	 // System.err.println(e);
	 // }
	 System.out.println("fhdkfjahdf" + list);
	 }
}

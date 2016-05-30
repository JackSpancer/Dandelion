/**
 * 
 */
package com.dandelion.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dandelion.dao.UserDao;
import com.dandelion.model.UserEntity;
import com.dandelion.service.UserService;

/**
 * 
 * @author JackSpancer
 *
 */
@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userDao;

	@Override
	public boolean deleteUser(UserEntity user) {		
		return userDao.deleteUser(user);
	}

	@Override
	public boolean isExist(UserEntity user) {
		return userDao.isExist(user);
	}
	
	@Override
	public boolean addUser(UserEntity user) {
		return userDao.addUser(user);
	}

	@Override
	public List<UserEntity> getAllUser() {
		return userDao.getAllUser();
	}
	
	

}

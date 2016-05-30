/**
 * 
 */
package com.dandelion.dao;

import java.util.List;

import com.dandelion.model.UserEntity;

/**
 * @author Aaron
 */
public interface UserDao {
	public boolean isExist(UserEntity user);
	
	public boolean addUser(UserEntity user);
	
	public boolean deleteUser(UserEntity user);
	
	public List<UserEntity> getAllUser();
	
}

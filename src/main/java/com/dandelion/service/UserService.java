/**
 * 
 */
package com.dandelion.service;

import java.util.List;

import com.dandelion.model.UserEntity;

/**
 * 
 * @author JackSpancer
 *
 */
public interface UserService {
	public boolean isExist(UserEntity user);

	public boolean addUser(UserEntity user);

	public boolean deleteUser(UserEntity user);

	public List<UserEntity> getAllUser();
}

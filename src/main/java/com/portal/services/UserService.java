package com.portal.services;

import java.util.Set;

import com.portal.entity.User;
import com.portal.entity.UserRole;

public interface UserService {

	//creating user
	public User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	
	//get user by username
	
	public User getUser(String username);
	
//	//delete user by userId
//	
//	public void deleteUser(Long userId);
	
}

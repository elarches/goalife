package com.goalife.dao;

import com.goalife.model.User;

public interface GoalifeDao {

	public boolean userExists(String username, String password);
	public User retrieveUser(String username, String password);
	
}

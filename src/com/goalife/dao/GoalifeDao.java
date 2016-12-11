package com.goalife.dao;

import com.goalife.model.User;

public interface GoalifeDao {

	public boolean userExists(String email, String password);
	public User retrieveUser(String email, String password);
	
}

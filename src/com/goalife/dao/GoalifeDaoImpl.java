package com.goalife.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.goalife.model.User;

public class GoalifeDaoImpl implements GoalifeDao{ 
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private static final String VALIDATE_EXISTING_USER = "SELECT COUNT(*) FROM users WHERE email = ? and password = ?";
	private static final String RETRIEVE_USER = "SELECT * FROM users WHERE email = ? and password = ?";
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	@Override
	public boolean userExists(String email, String password) {
		boolean exists = false;		
		jdbcTemplate = new JdbcTemplate(dataSource);
		int count = jdbcTemplate.queryForObject(
				VALIDATE_EXISTING_USER, new Object[] { email, password }, Integer.class);
		if (count > 0) {
			exists = true;
		}	
		return exists;
	}

	@Override
	public User retrieveUser(String email, String password) {		
		User loggedInUser = jdbcTemplate.queryForObject(
				RETRIEVE_USER, new Object[] { email, password },new BeanPropertyRowMapper<User>(User.class));
		return loggedInUser;		
	}
	
	
	//Add overriden methods
	
}

package com.goalife.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class GoalifeDaoImpl implements GoalifeDao{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	//TEST
	//Add overriden methods
	
}

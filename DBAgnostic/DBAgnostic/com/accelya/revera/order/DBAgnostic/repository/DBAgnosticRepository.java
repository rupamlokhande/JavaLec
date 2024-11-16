package com.accelya.revera.order.DBAgnostic.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * 
 * Repository for Order Interline
 *
 */
@Repository
public class DBAgnosticRepository
{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public DBAgnosticRepository()
	{
	}

	public String getData()
	{
		String x = jdbcTemplate.queryForObject("select 1 from dual", String.class);

		return x;

	}

}

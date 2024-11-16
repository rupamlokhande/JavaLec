package com.accelya.revera.order.DBAgnostic.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.accelya.revera.order.DBAgnostic.repository.DBAgnosticRepository;

@Component
public class DBAgnosticBL
{

	@Autowired
	private DBAgnosticRepository	DBAgnosticRepository;
	
	public String updateStatus()
	{
		return DBAgnosticRepository.getData();
			
	}

}

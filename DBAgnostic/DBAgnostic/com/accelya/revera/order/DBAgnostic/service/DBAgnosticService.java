package com.accelya.revera.order.DBAgnostic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accelya.revera.order.DBAgnostic.business.DBAgnosticBL;

/**
 * Service Class for Order Interline
 */
@Service
public class DBAgnosticService
{
	
	@Autowired
	private DBAgnosticBL orderInterlineBusiness;
	
	public String updateStatus()
	{
		String orderResponse = orderInterlineBusiness.updateStatus();
		
		return orderResponse;
	}
}

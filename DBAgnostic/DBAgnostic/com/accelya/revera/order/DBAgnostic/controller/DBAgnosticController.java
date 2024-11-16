package com.accelya.revera.order.DBAgnostic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accelya.revera.order.DBAgnostic.service.DBAgnosticService;

/**
 * Controller Class for Order Interline
 */
@RestController
@RequestMapping(value = "DBAgnostic")
public class DBAgnosticController 
{

	@Autowired
	private DBAgnosticService DBAgnosticService;


	/**
	 * Method to update the status of the order
	 *
	 * @return APITransferObject
	 */
	@PostMapping("/updateStatus")
	public String updateStatus()
	{
		return DBAgnosticService.updateStatus();

	}
}

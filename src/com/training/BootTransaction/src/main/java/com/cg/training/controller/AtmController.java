package com.cg.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.training.model.ATM;
import com.cg.training.model.AtmWrapper;
import com.cg.training.service.AtmService;


@RestController
public class AtmController {
	
	/**
	 * 
	 */
	@Autowired
	AtmService atmSer;

	@RequestMapping(value = "/addAtm", method = RequestMethod.POST)
	public ATM addAtm(final @RequestBody AtmWrapper atm)
	{
		return atmSer.createAtm(atm);
		
	}}

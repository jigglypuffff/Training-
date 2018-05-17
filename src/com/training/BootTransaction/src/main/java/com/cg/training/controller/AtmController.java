package com.cg.training.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.training.model.ATM;
import com.cg.training.model.AtmWrapper;


@RestController
public class AtmController {

	@RequestMapping(value = "/addAtm", method = RequestMethod.POST)
	public ATM addAtm(@RequestBody AtmWrapper atm)
	{
		return null;
		
	}
}

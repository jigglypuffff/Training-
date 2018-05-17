package com.cg.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.training.model.Bank;
import com.cg.training.service.BankService;
@RestController
public class BankController {

	@Autowired
	BankService bankSer;

	@RequestMapping(value = "/addbank", method = RequestMethod.POST)
	public void addBank(@RequestBody Bank bank) {
		bankSer.createBank(bank);
	}

	@RequestMapping(value = "/showbank", method = RequestMethod.GET)
	public List<Bank> showBankDetails() {
		return bankSer.getBankDetails();
	}
}

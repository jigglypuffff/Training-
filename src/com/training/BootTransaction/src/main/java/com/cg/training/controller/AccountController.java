package com.cg.training.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.training.model.AccountWrapper;
import com.cg.training.model.AccWithdrawWrap;
import com.cg.training.model.Account;
import com.cg.training.service.AccountService;

@RestController
public class AccountController {
	@Autowired
	AccountService accountSer;
	
	@RequestMapping(value = "/addAcc", method = RequestMethod.POST)
	public Account addAccount(@RequestBody AccountWrapper account) {
		return accountSer.createAccount(account);
	}
	
	@RequestMapping(value = "/showAcc", method = RequestMethod.GET)
	public List<Account> showAccDetails() {
		return accountSer.getAccountDetails();
	}
	
	@RequestMapping(value = "/deposit", method = RequestMethod.POST)
	public String depositAmount(@RequestBody AccWithdrawWrap wrap) {
		return accountSer.depositMoney(wrap);
				
	}
	
	@RequestMapping(value = "/withdraw", method = RequestMethod.POST)
	public String withdrawAmount(@RequestBody AccWithdrawWrap wrap) {
		return accountSer.withdrawMoney(wrap);
				
	}
}

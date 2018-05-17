package com.cg.training.service;

import java.math.BigDecimal;
import java.util.List;

import com.cg.training.model.AccountWrapper;
import com.cg.training.model.AccWithdrawWrap;
import com.cg.training.model.Account;

public interface AccountService {

	public Account createAccount(AccountWrapper account);

	public List<Account> getAccountDetails();

	//public String depositMoney(AccWithdrawWrap accWith, BigDecimal depamount);

	public String withdrawMoney(AccWithdrawWrap withdraw);

	public String depositMoney(AccWithdrawWrap wrap);
}

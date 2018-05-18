package com.cg.training.service;

import java.util.List;

import com.cg.training.model.AccWithdrawWrap;
import com.cg.training.model.Account;
import com.cg.training.model.AccountWrapper;

public interface AccountService {

	/**
	 * @param account
	 * @return
	 */
	 Account createAccount(AccountWrapper account);

	/**
	 * @return
	 */
	 List<Account> getAccountDetails();

	

	/**
	 * @param withdraw
	 * @return
	 */
	 String withdrawMoney(AccWithdrawWrap withdraw);

	/**
	 * @param wrap
	 * @return
	 */

	String depositMoney(AccWithdrawWrap deposit);

}



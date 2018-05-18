package com.cg.training.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.training.dao.AccountRepository;
import com.cg.training.dao.BankRepository;
import com.cg.training.dao.CustomerRepository;
import com.cg.training.dao.TransactionRepository;
import com.cg.training.model.AccWithdrawWrap;
import com.cg.training.model.Account;
import com.cg.training.model.AccountWrapper;
import com.cg.training.model.Bank;
import com.cg.training.model.Customer;
import com.cg.training.model.Transaction;

@Service
public class AccountServiceImpl implements AccountService {
	Logger log = Logger.getLogger("myfirstlogger");
	/**
	 * 
	 */
	@Autowired
	AccountRepository accDao;
	/**
	 * 
	 */
	@Autowired
	CustomerRepository custDao;
	/**
	 * 
	 */
	@Autowired
	BankRepository bankDao;
	/**
	 * 
	 */
	@Autowired
	TransactionRepository trans;

	@Override
	public String withdrawMoney(final AccWithdrawWrap withdraw) {
		log.info("Withdraw Section");
		Integer bankid = withdraw.getBankId();
		Optional<Bank> obj = bankDao.findById(bankid);
		Bank bankobj = obj.get();// through bank Id we fetched the bank object

		Integer accountId = withdraw.getAccount().getAccountId();

		Optional<Account> accobj = accDao.findById(accountId);

		Account accountobj = accobj.get();//// through account Id we fetched the account object

		BigDecimal amounttowithdraw = withdraw.getAmount();

		BigDecimal bankfetchedamount = bankobj.getAmount();

		BigDecimal customercurrentamount = accountobj.getAmount();

		BigDecimal updatedamount = customercurrentamount.subtract(amounttowithdraw);

		accountobj.setAmount(updatedamount);

		bankobj.setAmount(updatedamount);

		bankDao.save(bankobj);

		accDao.save(accountobj);
		Transaction trsansact = new Transaction(withdraw.getCustomerId(), accountId, amounttowithdraw, "Withdraw");

		trans.save(trsansact);

		return "success";

	}

	@Override
	public List<Account> getAccountDetails() {

		return accDao.findAll();
	}

	@Override
	public Account createAccount(final AccountWrapper account) {

		final Optional<Customer> custOpt = custDao.findById(account.getcId().getCustomerId());

		final Customer cust = custOpt.get();

		final Account acc = account.getAccount();

		acc.setCustomerId(cust);

		final Optional<Bank> bankOpt = bankDao.findById(account.getbId().getBankId());

		final Bank bank = bankOpt.get();

		acc.setBankId(bank);

		return accDao.save(acc);

	}


	@Override
	public String depositMoney(final AccWithdrawWrap deposit) {
		// TODO Auto-generated method stub
		Integer bankid = deposit.getBankId();
		Optional<Bank> obj = bankDao.findById(bankid);
		Bank bankobj = obj.get();// through bank Id we fetched the bank object

		Integer accountId = deposit.getAccount().getAccountId();

		Optional<Account> accobj = accDao.findById(accountId);

		Account accountobj = accobj.get();//// through account Id we fetched the account object

		BigDecimal amounttodeposit = deposit.getAmount();

		BigDecimal bankfetchedamount = bankobj.getAmount();

		BigDecimal customercurrentamount = accountobj.getAmount();

		BigDecimal updatedamount = amounttodeposit.add(customercurrentamount);

		accountobj.setAmount(updatedamount);

		bankobj.setAmount(updatedamount);

		bankDao.save(bankobj);

		accDao.save(accountobj);
		Transaction trsansact = new Transaction(deposit.getCustomerId(), accountId, amounttodeposit, "Deposit");

		trans.save(trsansact);

		return "success";
	}

}

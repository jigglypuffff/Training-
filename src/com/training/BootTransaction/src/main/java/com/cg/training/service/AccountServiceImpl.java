package com.cg.training.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

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

	@Autowired
	AccountRepository accDao;
	@Autowired
	CustomerRepository custDao;
	@Autowired
	BankRepository bankDao;
	@Autowired
	TransactionRepository trans;

	@Override
	public String withdrawMoney(AccWithdrawWrap withdraw) {

		Optional<Bank> bid = bankDao.findById(withdraw.getBank());
		Bank bank = bid.get();

		Optional<Account> id = accDao.findById(withdraw.getAccount()); // get acc id from db
		Account trueAcc = id.get(); // entire account object in trueAcc fetched by id

		BigDecimal amount = withdraw.getAmount(); // get amt from wrapper (to be withdrawn)
		BigDecimal result = trueAcc.getAmount().subtract(amount); // (balance)

		trueAcc.setAmount(result);
		bank.setAmount(result);

		accDao.save(trueAcc);
		bankDao.save(bank);
		return "Success";
	}

	@Override
	public List<Account> getAccountDetails() {

		return accDao.findAll();
	}

	@Override
	public Account createAccount(AccountWrapper account) {

		Optional<Customer> custOpt = custDao.findById(account.getcId());

		Customer cust = custOpt.get();

		Account acc = account.getAccount();

		acc.setCustomerId(cust);

		Optional<Bank> bankOpt = bankDao.findById(account.getbId());

		Bank bank = bankOpt.get();

		acc.setBankId(bank);

		return accDao.save(acc);

	}

	@Override
	public String depositMoney(AccWithdrawWrap wrap) {

		System.out.println("Hellossssssssssssss");
		
		Optional<Bank> bank = bankDao.findById(wrap.getBank());

		Bank banktrueobject = bank.get();

		Optional<Account> ob = accDao.findById(wrap.getAccount());

		Account obj = ob.get();

	//Customer id=	wrap.getAccount().getCustomerId();
	
	
	
	 //Optional<Customer> obj2=custDao.findById(id.getCustomerId());
	      
	// Customer u=obj2.get();
	 
	//Integer o= u.getCustomerId();
	
	//System.out.println("Welcome"+o);
	
		BigDecimal a = wrap.getAmount();

		BigDecimal customerinitialamount = obj.getAmount();

		BigDecimal c = a.add(customerinitialamount);

		BigDecimal d = banktrueobject.getAmount().add(a);

		banktrueobject.setAmount(d);

		bankDao.save(banktrueobject);

		obj.setAmount(c);

		accDao.save(obj);

		//Transaction tr = new Transaction(o, obj.getAccountId(), a, "Deposit");

		//trans.save(tr);

		return "Success";
	}

}

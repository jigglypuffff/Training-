package com.cg.training.model;

public class AccountWrapper {

	private Account account;
	private Bank bId;
	private Customer cId;
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Bank getbId() {
		return bId;
	}
	public void setbId(Bank bId) {
		this.bId = bId;
	}
	public Customer getcId() {
		return cId;
	}
	public void setcId(Customer cId) {
		this.cId = cId;
	}
	@Override
	public String toString() {
		return "AccBankCust [account=" + account + ", bId=" + bId + ", cId=" + cId + "]";
	}
	
	
	
	
	
}

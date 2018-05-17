package com.cg.training.model;

public class AccountWrapper {

	private Account account;
	private Integer bId;
	private Integer cId;
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Integer getbId() {
		return bId;
	}
	public void setbId(Integer bId) {
		this.bId = bId;
	}
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	@Override
	public String toString() {
		return "AccBankCust [account=" + account + ", bId=" + bId + ", cId=" + cId + "]";
	}
	
	
	
	
	
}

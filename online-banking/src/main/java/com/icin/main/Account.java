package com.icin.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "txnId")
	private int txnId;
	
	
	@Column(name = "userId")
	private String userId;
	
	@Column(name = "sendTo")
	private String sendTo;
	
	@Column(name = "date")
	private String date;
	
	@Column(name = "action")
	private String action;
	
	@Column(name = "amount")
	private String amount;
	
	@Column(name = "balance")
	private String balance;

	public int getTxnId() {
		return txnId;
	}

	public void setTxnId(int txnId) {
		this.txnId = txnId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSendTo() {
		return sendTo;
	}

	public void setSendTo(String sendTo) {
		this.sendTo = sendTo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [txnId=" + txnId + ", userId=" + userId + ", sendTo=" + sendTo + ", date=" + date + ", action="
				+ action + ", amount=" + amount + ", balance=" + balance + "]";
	}

	public Account() {
		super();
		
	}

	public Account(int txnId, String userId, String sendTo, String date, String action, String amount, String balance) {
		super();
		this.txnId = txnId;
		this.userId = userId;
		this.sendTo = sendTo;
		this.date = date;
		this.action = action;
		this.amount = amount;
		this.balance = balance;
	}

	
	
	
	





	

}

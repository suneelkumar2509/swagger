package com.banking.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bank_details")
public class CustomerBankDetails {
	@Id
	private String bankId;    
	private String accountType;
	private String accountNumber;
	private Double accountBalance;
	private List<Transaction>transactionHistory;
	public CustomerBankDetails(String bankId, String accountType, String accountNumber, Double accountBalance,
			List<Transaction> transactionHistory) {
		super();
		this.bankId = bankId;
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.transactionHistory = transactionHistory;
	}
	public CustomerBankDetails() {
		super();
	}
	public String getBankId() {
		return bankId;
	}
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public List<Transaction> getTransactionHistory() {
		return transactionHistory;
	}
	public void setTransactionHistory(List<Transaction> transactionHistory) {
		this.transactionHistory = transactionHistory;
	}
	@Override
	public String toString() {
		return "CustomerBankDetails [bankId=" + bankId + ", accountType=" + accountType + ", accountNumber="
				+ accountNumber + ", accountBalance=" + accountBalance + ", transactionHistory=" + transactionHistory
				+ "]";
	}
	
	

}

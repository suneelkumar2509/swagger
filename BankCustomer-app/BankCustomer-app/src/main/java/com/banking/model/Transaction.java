package com.banking.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "transaction")
public class Transaction {
	@Id
	private String transactionId;
	private Date  transactionDate;
	private String transactionType;
	private Double transactionAmount;
	public Transaction(String transactionId, Date  transactionDate, String transactionType, Double transactionAmount) {
		super();
		this.transactionId = transactionId;
		this.transactionDate = transactionDate;
		this.transactionType = transactionType;
		this.transactionAmount = transactionAmount;
	}
	
	public Transaction(Date  transactionDate, String transactionType, Double transactionAmount) {
		super();
		this.transactionDate = transactionDate;
		this.transactionType = transactionType;
		this.transactionAmount = transactionAmount;
	}

	public Transaction() {
		super();
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public Date  getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date  transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", transactionDate=" + transactionDate
				+ ", transactionType=" + transactionType + ", transactionAmount=" + transactionAmount + "]";
	}
	
	
	

}

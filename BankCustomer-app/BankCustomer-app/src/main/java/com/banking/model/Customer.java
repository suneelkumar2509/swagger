package com.banking.model;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customer")
public class Customer {
	
	@Id
	private String customerId;
	
	private String customerName;
	private char gender;
	private String customerDesignation;
	private CustomerAddress address;
	
	private CustomerBankDetails bankDetails;

	public Customer() {
		super();
	}

	public Customer(String customerId, String customerName, char gender, String customerDesignation,
			CustomerAddress address, CustomerBankDetails bankDetails) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.gender = gender;
		this.customerDesignation = customerDesignation;
		this.address = address;
		this.bankDetails = bankDetails;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getCustomerDesignation() {
		return customerDesignation;
	}

	public void setCustomerDesignation(String customerDesignation) {
		this.customerDesignation = customerDesignation;
	}

	public CustomerAddress getAddress() {
		return address;
	}

	public void setAddress(CustomerAddress address) {
		this.address = address;
	}

	public CustomerBankDetails getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(CustomerBankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", gender=" + gender
				+ ", customerDesignation=" + customerDesignation + ", address=" + address + ", bankDetails="
				+ bankDetails + "]";
	}

	
}

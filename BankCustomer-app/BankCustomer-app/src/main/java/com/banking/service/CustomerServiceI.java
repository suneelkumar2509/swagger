package com.banking.service;

import java.util.List;

import com.banking.model.Customer;

public interface CustomerServiceI {
	
	public Customer saveCustomer(Customer customer);
	public List<Customer> getAllCustomerWhoseSalGreaterThanOneLakh();
	
	public Customer getCustomerById(String id);
	public List<Customer>  getAllCustomerBasedOnTheirCreditPercentageOfEveryYear();

}

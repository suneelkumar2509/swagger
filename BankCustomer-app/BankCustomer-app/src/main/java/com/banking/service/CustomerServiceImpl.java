package com.banking.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.banking.model.Customer;
import com.banking.model.Transaction;
import com.banking.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerServiceI {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer saveCustomer(Customer customer) {

		return customerRepository.insert(customer);
	}

	@Override
	public List<Customer> getAllCustomerWhoseSalGreaterThanOneLakh() {
		List<Customer> customerList = customerRepository.findAll();
		// List<Customer> newCustomerList=new ArrayList<>();

		List<Customer> newCustomerList = customerList.stream()
				.filter(customer -> customer.getBankDetails().getAccountBalance() > 100000)
				.collect(Collectors.toList());

//		for(Customer customers:customerList) {
//			if(customers.getBankDetails().getAccountBalance()>100000) {
//				
//				newCustomerList.add(customers);
//			}
//		}

		return newCustomerList;
	}



	@Override
	public List<Customer> getAllCustomerBasedOnTheirCreditPercentageOfEveryYear() {

		List<Customer> customerList = customerRepository.findAll();

		List<Customer> newCustomersList = new ArrayList<>();
		
		Double creditForSavingAccount = 0.0;
		Double creditForCurrentAccount = 0.0;

		for (Customer customers : customerList) {
			if (customers.getBankDetails().getAccountType().equals("savings")
					&& customers.getBankDetails().getAccountBalance() > 100000) {
				creditForSavingAccount = customers.getBankDetails().getAccountBalance() * 0.05;

				customers.getBankDetails().getTransactionHistory()
						.add(new Transaction(new Date(), "credit", creditForSavingAccount));
				customerRepository.save(customers);

			} else if (customers.getBankDetails().getAccountType().equals("current")
					&& customers.getBankDetails().getAccountBalance() > 100000) {
				creditForCurrentAccount = customers.getBankDetails().getAccountBalance() * 0.10;

				customers.getBankDetails().getTransactionHistory()
						.add(new Transaction(new Date(), "credit", creditForCurrentAccount));
				customerRepository.save(customers);
			} 
			newCustomersList.add(customers);
		}

		return newCustomersList;
	}

	@Override
	public Customer getCustomerById(String id) {
	Customer newCustomer=customerRepository.findById(id).get();
		return newCustomer;
	}

}

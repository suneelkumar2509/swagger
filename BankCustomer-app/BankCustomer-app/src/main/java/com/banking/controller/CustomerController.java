package com.banking.controller;

import java.util.List;


import com.banking.model.Customer;
import com.banking.service.CustomerServiceI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	@Autowired
	private CustomerServiceI customerServiceI;
	
	
	@PostMapping("/customers")
	public ResponseEntity<?>saveCustomerDetails(@RequestBody Customer customer){
		return new ResponseEntity<Customer>(customerServiceI.saveCustomer(customer), HttpStatus.CREATED);
	}
	
	
	
	@GetMapping("/customers")
	public ResponseEntity<?>getCustomersWhoseSalGreaterThanOneLakh(){
		
	List<Customer> customerList=customerServiceI.getAllCustomerWhoseSalGreaterThanOneLakh();
		
	return new ResponseEntity<List<Customer>>(customerList, HttpStatus.OK);
	}
    @GetMapping("/credit")
	public ResponseEntity<?> creditStatusOfCustomer() {
		return new  ResponseEntity<List<Customer>>(customerServiceI.getAllCustomerBasedOnTheirCreditPercentageOfEveryYear(), HttpStatus.OK);
		
	
	}
	@GetMapping("/customers/{id}")
	public ResponseEntity<?>getCustomerByID(@PathVariable("id")String id){
		return new ResponseEntity<Customer>(customerServiceI.getCustomerById(id), HttpStatus.OK);
		
	}
}

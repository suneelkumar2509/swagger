package com.banking.repository;

import com.banking.model.Customer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

	//public Customer FindByCustomerId(String id);
}

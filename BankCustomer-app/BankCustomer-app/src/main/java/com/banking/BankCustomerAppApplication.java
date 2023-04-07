package com.banking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;



@SpringBootApplication
public class BankCustomerAppApplication implements CommandLineRunner {
	@Autowired
	private MongoTemplate  mongoTemplate;

	public static void main(String[] args) {
		SpringApplication.run(BankCustomerAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		
		System.out.println("hiiiiiiiiiiiiiiiii"+mongoTemplate.getCollectionNames());
	}

}

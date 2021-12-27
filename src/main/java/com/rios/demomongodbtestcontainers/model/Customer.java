package com.rios.demomongodbtestcontainers.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Customer {
	
	@Id
	private String id;
	
	private String firstName;
	private String lastName;

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
}

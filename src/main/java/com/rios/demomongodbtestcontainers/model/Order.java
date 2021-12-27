package com.rios.demomongodbtestcontainers.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class Order {
	
	private Long id;
	
    @EqualsAndHashCode.Exclude
	private Customer customer;
}

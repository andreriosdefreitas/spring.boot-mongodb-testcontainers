package com.rios.demomongodbtestcontainers.service;

import java.util.List;

import com.rios.demomongodbtestcontainers.model.Customer;
import com.rios.demomongodbtestcontainers.repository.CustomerRepository;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerService {
    
    private CustomerRepository customerRepository;

    public Customer create(String firstName, String lastName) {
        return customerRepository.save(new Customer(firstName, lastName));
    }

    public Customer findByFirstName(String firstName) {
        return customerRepository.findByFirstName(firstName);
    }

    public List<Customer> findByLastName(String lastName) {
        return customerRepository.findByLastName(lastName);
    }
}

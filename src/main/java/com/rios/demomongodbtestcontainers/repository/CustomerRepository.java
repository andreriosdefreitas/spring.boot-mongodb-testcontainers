package com.rios.demomongodbtestcontainers.repository;

import java.util.List;

import com.rios.demomongodbtestcontainers.model.Customer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
    Customer findByFirstName(String firstName);
    List<Customer> findByLastName(String lastName);
}

package com.customer.repository;

import org.springframework.data.repository.CrudRepository;

import com.customer.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}

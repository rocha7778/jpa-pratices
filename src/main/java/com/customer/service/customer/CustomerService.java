package com.customer.service.customer;

import java.util.List;

import com.customer.entity.Customer;

public interface CustomerService {
	public List<Customer> findAll();
	public Customer create(Customer customer);
	public Customer addInvoiceToCustomer(Long customerId, Long invoiceId);
}

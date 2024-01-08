package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.entity.Customer;
import com.customer.service.customer.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping
	public List<Customer> getCustomer() {
		return customerService.findAll();
	}

	@PostMapping
	public Customer create(@RequestBody Customer c) {
		return customerService.create(c);
	}

	@PostMapping("/{id}/invoice/{invoiceId}")
	public Customer addInvoiceToCustomer(@PathVariable(name = "id") Long id,
			@PathVariable(name = "invoiceId") Long invoiceId) {
		return customerService.addInvoiceToCustomer(id, invoiceId);
	}
}

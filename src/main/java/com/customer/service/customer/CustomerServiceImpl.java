package com.customer.service.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.entity.Customer;
import com.customer.entity.Invoice;
import com.customer.repository.CustomerRepository;
import com.customer.repository.InvoiceRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private InvoiceRepository invoiceRepository;

	@Override
	public List<Customer> findAll() {
		return (List<Customer>) customerRepository.findAll();
	}

	@Override
	public Customer create(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer addInvoiceToCustomer(Long customerId, Long invoiceId) {
		Customer customer = customerRepository.findById(customerId).get();
		Invoice invoice = invoiceRepository.findById(invoiceId).get();
		invoice.setCustomer(customer);
		customer.addInvoice(invoice);
		return customerRepository.save(customer);
	}

}

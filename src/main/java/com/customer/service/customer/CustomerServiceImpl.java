package com.customer.service.customer;

import java.util.List;

import org.springframework.stereotype.Service;

import com.customer.entity.Customer;
import com.customer.entity.Invoice;
import com.customer.repository.CustomerRepository;
import com.customer.repository.InvoiceRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	private InvoiceRepository invoiceRepository;
	

	public CustomerServiceImpl(CustomerRepository customerRepository, InvoiceRepository invoiceRepository) {
		super();
		this.customerRepository = customerRepository;
		this.invoiceRepository = invoiceRepository;
	}

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

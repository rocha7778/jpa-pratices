package com.customer.service.invoice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.customer.entity.Invoice;
import com.customer.repository.InvoiceRepository;

@Service
public class InvoiceServiceImpl implements InvoiceService {
	
	private InvoiceRepository repository;

	public InvoiceServiceImpl(InvoiceRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Invoice createInvoice(Invoice invoice) {
		return repository.save(invoice);
	}

	@Override
	public List<Invoice> findAll() {
		return (List<Invoice>) repository.findAll();
	}

}

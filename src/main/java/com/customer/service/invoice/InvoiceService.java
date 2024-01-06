package com.customer.service.invoice;

import java.util.List;

import com.customer.entity.Invoice;

public interface InvoiceService {
	public Invoice createInvoice(Invoice invoice);
	public List<Invoice> findAll();
}

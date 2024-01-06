package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.entity.Invoice;
import com.customer.service.invoice.InvoiceService;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {
	
	@Autowired
	private InvoiceService invoiceService;
	
	@PostMapping
	public Invoice create(@RequestBody Invoice invoice) {
		return invoiceService.createInvoice(invoice);
	}
	
	@GetMapping
	public List<Invoice> findAll(){
		return invoiceService.findAll();
	}
	

}

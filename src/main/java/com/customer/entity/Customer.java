package com.customer.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<Invoice> invoices = new ArrayList<>();
	

	public Customer(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Customer() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Invoice> getInvoices() {
		return invoices;
	}

	public void addInvoice(Invoice invoice) {
		invoices.add(invoice);
	}
	
	public void removeInvoice(Invoice invoice) {
		invoices.remove(invoice);
	}
	
}

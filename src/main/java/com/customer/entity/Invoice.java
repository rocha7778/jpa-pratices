package com.customer.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Invoice {
	
	@Id
	@GeneratedValue
	private Long id;
	private String serviceName;
	private Long totalCost;
	
	
	@ManyToOne
    @JoinColumn(name = "customer_id")
	@JsonIgnore
    private Customer customer;
	
	
	public Invoice() {
		super();
	}

	public Invoice(Long id, String serviceName, Long totalCost) {
		super();
		this.id = id;
		this.serviceName = serviceName;
		this.totalCost = totalCost;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public Long getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Long totalCost) {
		this.totalCost = totalCost;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
	
	
	
	

}

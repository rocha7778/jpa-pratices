package com.customer.repository;

import org.springframework.data.repository.CrudRepository;

import com.customer.entity.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice,Long> {

}

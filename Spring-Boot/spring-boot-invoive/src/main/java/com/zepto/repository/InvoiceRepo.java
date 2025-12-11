package com.zepto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zepto.entity.Invoice;

@Repository
public interface InvoiceRepo extends CrudRepository<Invoice, Integer> {

}

package com.mkpits.cablecms.service;

import com.mkpits.cablecms.model.Customer;

public interface CustomerService {

    public Iterable<Customer> findAll();
}

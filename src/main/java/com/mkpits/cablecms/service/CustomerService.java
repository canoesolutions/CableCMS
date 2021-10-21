package com.mkpits.cablecms.service;

import com.mkpits.cablecms.model.SearchCustomer;

public interface CustomerService {

    public Iterable<SearchCustomer> findAll();
}

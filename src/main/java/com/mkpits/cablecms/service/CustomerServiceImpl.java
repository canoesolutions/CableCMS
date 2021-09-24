package com.mkpits.cablecms.service;

import com.mkpits.cablecms.dao.CustomerRepo;
import com.mkpits.cablecms.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Transactional
@Service("customerService")
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepo customerRepo;

    @Override
    public Iterable<Customer> findAll(){
        return customerRepo.findAll();
    }

}

package com.mkpits.cablecms.service;

import com.mkpits.cablecms.dao.CustomerRepo;
import com.mkpits.cablecms.model.SearchCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Transactional
@Service("customerService")
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepo customerRepo;

    @Override
    public Iterable<SearchCustomer> findAll(){
        return customerRepo.findAll();
    }

}

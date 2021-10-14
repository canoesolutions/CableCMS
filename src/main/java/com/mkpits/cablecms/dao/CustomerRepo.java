package com.mkpits.cablecms.dao;

import com.mkpits.cablecms.model.Admin;
import com.mkpits.cablecms.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository("customerRepo")
public interface CustomerRepo extends JpaRepository<Customer,Integer>{
//    Customer findByUserName(String username);
}

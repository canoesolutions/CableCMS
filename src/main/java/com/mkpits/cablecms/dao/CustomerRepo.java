package com.mkpits.cablecms.dao;

import com.mkpits.cablecms.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Integer>{
}

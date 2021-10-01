package com.mkpits.cablecms.dao;

import com.mkpits.cablecms.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin,Integer> {
   //Admin findByUsername(String username);
}

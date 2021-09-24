package com.mkpits.cablecms.dao;

import com.mkpits.cablecms.model.Admin;
import com.mkpits.cablecms.dto.AdminDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin,Integer> {
    public Admin findByUsername(String username);
}

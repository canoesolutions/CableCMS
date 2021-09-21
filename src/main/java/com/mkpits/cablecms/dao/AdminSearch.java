package com.mkpits.cablecms.dao;

import com.mkpits.cablecms.dto.AdminDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminSearch extends JpaRepository<AdminDto,Integer> {
    AdminDto findByUsername(String username);
}

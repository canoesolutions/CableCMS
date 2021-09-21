package com.mkpits.cablecms.service;

import com.mkpits.cablecms.dao.AdminSearch;
import com.mkpits.cablecms.dto.AdminDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    AdminSearch adminSearch;

    public AdminDto searchAdmin(AdminDto adminDto){
        adminSearch.findByUsername(adminDto.getUsername());
        return null;
    }
}

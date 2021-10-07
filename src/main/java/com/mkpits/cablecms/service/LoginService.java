/*package com.mkpits.cablecms.service;

import com.mkpits.cablecms.dao.AdminRepo;
import com.mkpits.cablecms.dto.AdminDto;
import com.mkpits.cablecms.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    AdminRepo adminRepo;

    public  String searchAdmin(AdminDto adminDto){
        Admin admin=adminRepo.findByUsername(adminDto.getUsername(), adminDto.getPassword());

        if (admin==null){
            return "/";
        }
        else {
            return "dashboard";
        }
    }
}*/



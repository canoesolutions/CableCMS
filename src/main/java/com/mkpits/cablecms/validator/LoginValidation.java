package com.mkpits.cablecms.validator;


import com.mkpits.cablecms.dto.AdminDto;
import com.mkpits.cablecms.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginValidation {
    @Autowired
    Admin admin;

    @Autowired
    AdminDto adminDto;

    public String loginValidation(){
        if(admin.getUserName().equals(adminDto.getUsername())&&admin.getPassword().equals(adminDto.getPassword())){
            return "dashboard";
        } else {
            return "/";
        }
    }
}


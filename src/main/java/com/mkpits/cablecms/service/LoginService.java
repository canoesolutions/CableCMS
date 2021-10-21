

package com.mkpits.cablecms.service;

import com.mkpits.cablecms.dao.AdminRepo;
import com.mkpits.cablecms.dto.AdminDto;
import com.mkpits.cablecms.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LoginService {
    @Autowired
    AdminRepo adminRepo;

    /*public  String searchAdmin(AdminDto adminDto){

*//*Admin admin=adminRepo.findByUsername(adminDto.getUsername(), adminDto.getPassword());

        if (admin==null){
            return "/";
        }
        else {
            return "dashboard";
        }*//*


        String res1 = "User Not Found, Please register!!";

        ResultSet resultSet= (ResultSet) adminRepo.findAll();

        try {
            while (resultSet.next()) {
                adminDto.getUsername().equals(resultSet.getString("username"));
                adminDto.getPassword().equals(resultSet.getString("password"));
                res1 = "Login Successful";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return res1;
    }*/

    public Admin findByUserName(String username,String password){
        Optional<Admin> admin=adminRepo.findByUsername(username,password);
        return admin.orElse(null);
    }
}





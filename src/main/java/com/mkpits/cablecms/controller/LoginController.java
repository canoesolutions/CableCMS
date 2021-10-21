
package com.mkpits.cablecms.controller;

import com.mkpits.cablecms.dto.AdminDto;
import com.mkpits.cablecms.model.Admin;
import com.mkpits.cablecms.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String loginController(@RequestParam("username") String username, @RequestParam("password") String password) {
        AdminDto adminDto=AdminDto.builder()
                .username(username)
                .password(password)
                .build();
        /*String str=loginService.searchAdmin(adminDto);

        //To forward page based on admin authentication
        if (str.equals("User Not Found, Please register!!")) {
            return "/register";
        } else {
            return "/dashboard";
        }*/

        Admin existing=loginService.findByUserName(adminDto.getUsername(), adminDto.getPassword());

        if (existing==null){
            return "/";
        }
        else {
            return "searchcustomer";
        }
    }
}


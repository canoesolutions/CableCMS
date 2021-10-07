/*
package com.mkpits.cablecms.controller;

import com.mkpits.cablecms.dto.AdminDto;
import com.mkpits.cablecms.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
        String str=loginService.searchAdmin(adminDto);
        return str;
    }
}
*/

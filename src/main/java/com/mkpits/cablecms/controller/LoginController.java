package com.mkpits.cablecms.controller;

import com.mkpits.cablecms.dto.AdminDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String loginController(@RequestParam("username") String username, @RequestParam("password") String password) {
        AdminDto adminDto=AdminDto.builder()
                .username(username)
                .password(password)
                .build();

        return "dashboard";
    }
}

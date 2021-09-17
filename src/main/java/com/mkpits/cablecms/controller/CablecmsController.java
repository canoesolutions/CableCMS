package com.mkpits.cablecms.controller;

import com.mkpits.cablecms.response.LoginResponse;
import com.mkpits.cablecms.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CablecmsController {
    @Autowired
    LoginService loginService;

    @GetMapping("/")
    public String login(Model model) {

        LoginResponse loginResponse=loginService.getLogin();
        model.addAttribute("login",loginResponse);
        return "index";
    }
}

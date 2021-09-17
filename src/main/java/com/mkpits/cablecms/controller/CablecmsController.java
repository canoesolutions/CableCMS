package com.mkpits.cablecms.controller;

import com.mkpits.cablecms.response.LoginResponse;
import com.mkpits.cablecms.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CablecmsController {
    @Autowired
    LoginService loginService;

    @RequestMapping(name="/",method = RequestMethod.GET)
    public String login(Model model) {

        LoginResponse loginResponse=loginService.getLogin();
        model.addAttribute("login",loginResponse);
        return "login";
    }
}

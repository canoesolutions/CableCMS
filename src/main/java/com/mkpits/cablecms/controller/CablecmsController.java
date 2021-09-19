package com.mkpits.cablecms.controller;

import com.mkpits.cablecms.response.LoginResponse;
import com.mkpits.cablecms.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CablecmsController {
    //@Autowired
    //LoginService loginService;

    @GetMapping("/")
    public String homecontroller() {

        //LoginResponse loginResponse=loginService.getLogin();
        //model.addAttribute("cablecmsController",loginResponse);
        return "login";
    }

    @GetMapping("/register")
    public String registerController(){
        return "register";
    }

    @GetMapping("/forgotpassword")
    public String forgotpasswordController(){
        return "forgotpassword";
    }

    @GetMapping("/login")
    public String loginController() {
        return "dashboard";
    }

    @GetMapping("/searchcustomer")
    public String searchcustomerController() {
        return "searchcustomer";
    }

    @GetMapping("/searchconnections")
    public String searchconnectionsController() {
        return "searchconnections";
    }

    @GetMapping("/searchreceipt")
    public String searchreceiptController() {
        return "searchreceipt";
    }

    @GetMapping("/makereceipt")
    public String makereceiptController() {
        return "makereceipt";
    }

    @GetMapping("/customerbilling")
    public String customerbillingController() {
        return "customerbilling";
    }

    @GetMapping("/addcustomer")
    public String caddcustomerController() {
        return "addcustomer";
    }

    @GetMapping("/addarea")
    public String addareaController() {
        return "addarea";
    }

    @GetMapping("/addpackage")
    public String addpackageController() {
        return "addpackage";
    }

    @GetMapping("/manageprofile")
    public String manageprofileController() {
        return "manageprofile";
    }


}

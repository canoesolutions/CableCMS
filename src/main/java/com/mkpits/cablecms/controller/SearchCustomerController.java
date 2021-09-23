package com.mkpits.cablecms.controller;

import com.mkpits.cablecms.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SearchCustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/searchcustomer", method = RequestMethod.GET)
    public String searchCustomerController(ModelMap modelMap){
        modelMap.put("customers", customerService.findAll());
        return "searchcustomer";
    }
}

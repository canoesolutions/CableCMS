package com.mkpits.cablecms.controller;

import com.mkpits.cablecms.service.CustomerService;
import com.mkpits.cablecms.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/searchcustomer")
public class SearchCustomerController {

    @Autowired
    CustomerServiceImpl customerServiceImpl;

    @RequestMapping(method = RequestMethod.GET)
    public String searchCustomerController(ModelMap modelMap){
        modelMap.put("customers", customerServiceImpl.findAll());
        return "searchcustomer";
    }
}


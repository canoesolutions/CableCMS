/*
package com.mkpits.cablecms.controller;

import com.mkpits.cablecms.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {

    @Autowired
    CustomerService dashboardService;

    @RequestMapping(method = RequestMethod.GET)
    public String dashboardController(ModelMap modelMap){
        modelMap.put("dashboard", dashboardService.findAll());
        return "dashboard";
    }

}
*/

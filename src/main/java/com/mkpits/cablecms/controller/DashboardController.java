
package com.mkpits.cablecms.controller;

import com.mkpits.cablecms.model.Dashboard;
import com.mkpits.cablecms.service.DashboardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {

    @Autowired
    DashboardServiceImpl dashboardServiceImpl;

    @RequestMapping(method = RequestMethod.GET)
    public String dashboardController(ModelMap modelMap){
        Date d=new Date();
        Dashboard dashboard=dashboardServiceImpl.findByMonth((d.getMonth()+1));
        modelMap.put("dashboard", dashboard);

        return "dashboard";
    }

}


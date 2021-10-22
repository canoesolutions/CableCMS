package com.mkpits.cablecms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EditCustomerController {

    @RequestMapping(value="/editcustomer/{id}")
    public String editCustomerController(@PathVariable int id, ModelMap model){
        try {
            Employee employee = employeeService.getEmployeeById(id);
            model.addAttribute("employee", employee);
            return "editEmployee";
        } catch (Exception ex) {
            return "index";
        }
        return "editcustomer";
    }

    @RequestMapping(value="/editcustomer")
    public String editCustomerController(){

        return "editcustomer";
    }
}

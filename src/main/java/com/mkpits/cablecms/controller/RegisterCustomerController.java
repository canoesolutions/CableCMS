package com.mkpits.cablecms.controller;

import com.mkpits.cablecms.model.Addcustomer;
import com.mkpits.cablecms.service.AddCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterCustomerController {
    @Autowired
    AddCustomerService addCustomerService;

    @RequestMapping(value="/registercustomer", method = RequestMethod.GET)
    public String resgisterCustomerController(@RequestParam("firstname") String firstname,
                                          @RequestParam("lastname") String lastname,
                                          @RequestParam("phoneno") String phoneno,
                                          @RequestParam("address") String address,
                                          @RequestParam("packageamount") String packageamount,
                                          @RequestParam("area") String area,
                                          @RequestParam("balance") String balance,
                                          @RequestParam("setupboxno") String setupboxno,
                                          @RequestParam("status") String status){
        Addcustomer addcustomer= Addcustomer.builder()

                .firstName(firstname)
                .lastName(lastname)
                .phoneNo(phoneno)
                .address(address)
                .packageAmount(packageamount)
                .area(area)
                .balance(balance)
                .setupboxno(setupboxno)
                .status(status)
                .build();
        addCustomerService.createCustomer(addcustomer);
        return "addcustomer";
    }

}

package com.mkpits.cablecms.controller;

import com.mkpits.cablecms.model.Addarea;
import com.mkpits.cablecms.service.RegisterAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterAreaController {
    @Autowired
    RegisterAreaService registerAreaService;

    @RequestMapping(value="/registerarea", method = RequestMethod.GET)
    public String resgisterAreaController(@RequestParam("areaname") String areaname){

        Addarea addarea= Addarea.builder()

                .areaName(areaname)

                .build();
        registerAreaService.createArea(addarea);
        return "addarea";
    }
}

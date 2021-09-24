package com.mkpits.cablecms.service;

import com.mkpits.cablecms.dao.AddAreaRepo;
import com.mkpits.cablecms.model.Addarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterAreaService {
    @Autowired
    AddAreaRepo addAreaRepo;

    public Addarea createAdmin(Addarea addarea){
        addAreaRepo.save(addarea);
        //adminRepo.findOne();
        return null;
    }

}

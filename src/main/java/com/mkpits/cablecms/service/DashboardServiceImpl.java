
package com.mkpits.cablecms.service;

import com.mkpits.cablecms.dao.DashboardRepo;
import com.mkpits.cablecms.model.Dashboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardServiceImpl {

    @Autowired
    DashboardRepo dashboardRepo;

    public Dashboard findByMonth(int month){
        return dashboardRepo.findByMonth(month);
    }
}


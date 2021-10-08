package com.mkpits.cablecms.dao;

import com.mkpits.cablecms.model.Dashboard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DashboardRepo extends JpaRepository<Dashboard,Integer> {
    Dashboard findByMonth(int month);
}

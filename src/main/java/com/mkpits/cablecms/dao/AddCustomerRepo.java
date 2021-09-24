package com.mkpits.cablecms.dao;
import com.mkpits.cablecms.model.Addcustomer;
import com.mkpits.cablecms.model.Admin;
import com.mkpits.cablecms.dto.AdminDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddCustomerRepo extends JpaRepository<Addcustomer,Integer> {
}

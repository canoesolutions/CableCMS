package com.mkpits.cablecms.dao;

import com.mkpits.cablecms.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AdminRepo extends JpaRepository<Admin,Integer> {

   @Query("SELECT u FROM admin u WHERE u.username = :username and u.password = :password")
   public Admin findByUsername(@Param("username") String username,@Param("password") String password);
}


package com.mkpits.cablecms.dao;

import com.mkpits.cablecms.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AdminRepo extends JpaRepository<Admin,Integer> {

  /* @Query("SELECT a FROM admin a WHERE a.username = :username and a.password = :password")
   public Admin findByUsername(@Param("username") String username, @Param("password") String password);*/

    Admin findByUserName(String username);
}


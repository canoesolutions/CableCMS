package com.mkpits.cablecms.service;

import com.mkpits.cablecms.response.LoginResponse;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public LoginResponse getLogin(){
        LoginResponse loginResponse= LoginResponse.builder().username("admin").password("admin").build();
        return loginResponse;
    }
}

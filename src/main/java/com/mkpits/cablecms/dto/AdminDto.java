package com.mkpits.cablecms.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
@Builder
public class AdminDto {
    private String username;
    private String password;

}

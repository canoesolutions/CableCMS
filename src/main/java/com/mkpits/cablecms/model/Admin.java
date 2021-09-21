package com.mkpits.cablecms.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Builder
@Entity
@Table(name = "admin")
public class Admin implements Serializable {
    @Id
    @Column(name = "adminid")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "false")
    private Integer adminId;

    @Column(name="companyname")
    private String companyName;

    @Column(name = "username")
    private String userName;

    @Column(name = "emailaddress")
    private String emailAddress;

    @Column(name = "contactnumber")
    private String contactNumber;

    @Column(name = "password")
    private String password;


}

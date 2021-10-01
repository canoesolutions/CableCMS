package com.mkpits.cablecms.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer implements Serializable {
    @Id
    @Column(name = "customerid")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "false")
    private Integer customerId;

    @Column(name="firstname")
    private String firstName;

    @Column(name="lastname")
    private String lastName;

    @Column(name = "setupboxno")
    private String setupBoxNo;

    @Column(name="area")
    private String area;

    @Column(name="packageamount")
    private String packageAmount;

    @Column(name="balance")
    private String balance;

    @Column(name="status")
    private String status;

   /* @Column(name = "phoneno")
    private String phoneNo;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;*/


}

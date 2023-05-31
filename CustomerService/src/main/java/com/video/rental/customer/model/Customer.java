package com.video.rental.customer.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Customer {

    @Id
    @Column(name="customerid")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer customerid;
    private String username;
    private String password;
    private String address;


}

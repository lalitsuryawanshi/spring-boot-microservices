package com.video.calculator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerBill {

    @Id
    @Column(name="billid")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer billid;

    private String customerName;

    private String movieName;
    private Double rentPerDay;

    private Integer rentDays;

    private Double totalBill;

}

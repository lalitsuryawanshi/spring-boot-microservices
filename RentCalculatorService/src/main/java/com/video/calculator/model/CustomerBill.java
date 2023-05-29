package com.video.calculator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerBill {

    @Id
    private Integer id;

    private String customerName;

    private String movieName;
    private Double rentPerDay;

    private Integer rentDays;

    private Double totalBill;

}

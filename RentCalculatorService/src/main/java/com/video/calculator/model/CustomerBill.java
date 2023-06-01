package com.video.calculator.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerBill {

    private String customerName;
    private String movieName;
    private Double rentPerDay;
    private Integer rentDays;
    private Double totalBill;

}

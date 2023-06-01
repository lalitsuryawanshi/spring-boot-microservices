package com.video.calculator.service;

import com.video.calculator.model.CustomerBill;

import java.util.Optional;

public interface RentCalculatorService {

    Optional<CustomerBill> calculateCustomerRent(String customerId, String movieId, String numberOfDays);
}

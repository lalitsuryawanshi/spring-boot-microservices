package com.video.calculator.controller;

import com.video.calculator.model.CustomerBill;
import com.video.calculator.service.RentCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CalculatorController {

    @Autowired
    private final RentCalculatorService rentCalculatorService;

    public CalculatorController(RentCalculatorService rentCalculatorService) {
        this.rentCalculatorService = rentCalculatorService;
    }

    @GetMapping("/customer-bill/customer/{customerId}/movie/{movieId}/days/{numberOfDays}")
    public ResponseEntity calculateCustomerBill( @PathVariable String customerId,
                                                 @PathVariable String movieId,
                                                 @PathVariable String numberOfDays) {

        Optional<CustomerBill> customerBill = rentCalculatorService.calculateCustomerRent(customerId, movieId, numberOfDays);

        return customerBill.map(bill -> ResponseEntity.ok().body(bill)).orElseGet(() -> (ResponseEntity) ResponseEntity.notFound());
    }
}

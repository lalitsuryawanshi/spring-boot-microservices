package com.video.calculator.controller;

import com.video.calculator.model.RentCalculation;
import com.video.calculator.service.RentCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CalculatorController {

    @Autowired
    private final RentCalculatorService rentCalculatorService;

    public CalculatorController(RentCalculatorService rentCalculatorService) {
        this.rentCalculatorService = rentCalculatorService;
    }

    @GetMapping("/bills")
    public ResponseEntity<List<RentCalculation>> fetchAllRentCalculations(){
        return ResponseEntity.ok(rentCalculatorService.fetchAllRentCalculations());
    }

    @GetMapping("/bills/{customerId}")
    public ResponseEntity<RentCalculation> fetchOneRentCalculation(@PathVariable String customerId){
        Optional<RentCalculation> rent = rentCalculatorService.findOneRentCalculation(Integer.valueOf(customerId));
        if (rent.isPresent()) {
            return ResponseEntity.ok(rentCalculatorService.findOneRentCalculation(Integer.valueOf(customerId)).get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

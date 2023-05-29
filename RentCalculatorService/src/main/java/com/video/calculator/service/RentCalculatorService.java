package com.video.calculator.service;

import com.video.calculator.model.RentCalculation;

import java.util.List;
import java.util.Optional;

public interface RentCalculatorService {

    List<RentCalculation> fetchAllRentCalculations();

    Optional<RentCalculation> findOneRentCalculation(Integer id);
}

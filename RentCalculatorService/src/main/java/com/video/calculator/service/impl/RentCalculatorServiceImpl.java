package com.video.calculator.service.impl;

import com.video.calculator.model.RentCalculation;
import com.video.calculator.repository.CalculatorRepository;
import com.video.calculator.service.RentCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RentCalculatorServiceImpl implements RentCalculatorService {

    @Autowired
    private final CalculatorRepository calculatorRepository;

    public RentCalculatorServiceImpl(CalculatorRepository calculatorRepository) {
        this.calculatorRepository = calculatorRepository;
    }

    @Override
    public List<RentCalculation> fetchAllRentCalculations() {

        return calculatorRepository.findAll();
    }

    @Override
    public Optional<RentCalculation> findOneRentCalculation(Integer id) {
        return calculatorRepository.findById(id);
    }


}

package com.video.calculator.repository;

import com.video.calculator.model.RentCalculation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CalculatorRepository extends JpaRepository<RentCalculation, Integer> {


}

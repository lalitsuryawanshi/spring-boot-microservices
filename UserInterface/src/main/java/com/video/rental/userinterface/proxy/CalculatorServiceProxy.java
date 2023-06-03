package com.video.rental.userinterface.proxy;

import com.video.rental.userinterface.model.CustomerBill;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="calculator-service", url="localhost:8082")
public interface CalculatorServiceProxy {

    @GetMapping("/customer-bill/customer/{customerId}/movie/{movieId}/days/{numberOfDays}")
    public CustomerBill calculateCustomerBill(@PathVariable String customerId,
                                              @PathVariable String movieId,
                                              @PathVariable String numberOfDays);
}

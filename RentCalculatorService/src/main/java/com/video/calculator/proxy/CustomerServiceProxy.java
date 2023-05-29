package com.video.calculator.proxy;

import com.video.calculator.model.CustomerBill;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="customer-service", url="localhost:8080")
public interface CustomerServiceProxy {

    @GetMapping("/customers/{customerId}")
    public CustomerBill findOneCustomer(@PathVariable Integer customerId );
}

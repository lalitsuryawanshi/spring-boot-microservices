package com.video.rental.userinterface.proxy;


import com.video.rental.userinterface.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@FeignClient(name="customer-service", url="localhost:8080")
public interface CustomerServiceProxy {

    @GetMapping("/customers")
    public List<Customer> fetchAllCustomers();
}

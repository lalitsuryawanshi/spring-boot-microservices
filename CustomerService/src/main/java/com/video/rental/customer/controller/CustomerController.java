package com.video.rental.customer.controller;

import com.video.rental.customer.model.Customer;
import com.video.rental.customer.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> fetchAllCustomers(){
        return ResponseEntity.ok().body(customerService.fetchAllCustomers());
    }

    @GetMapping("/customers/{customerId}")
    public ResponseEntity<Optional<Customer>> findOneCustomer(@PathVariable Integer customerId ){
        return ResponseEntity.ok().body(customerService.findOneCustomer(customerId));
    }
}

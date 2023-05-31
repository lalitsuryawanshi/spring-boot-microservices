package com.video.rental.customer.controller;

import com.video.rental.customer.model.Customer;
import com.video.rental.customer.service.CustomerService;
import feign.Body;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/customers")
    public ResponseEntity<Customer> postNewCustomer(@RequestBody Customer customer){
        Customer saved = customerService.addNewCustomer(customer);
        return ResponseEntity.ok().body(saved);
    }

    @DeleteMapping("/customers/{customerId}")
    public ResponseEntity deleteCustomer(@PathVariable Integer customerId ){
        customerService.deleteCustomer(customerId);
        return ResponseEntity.ok().body("Customer Deleted Successfuly");
    }
}

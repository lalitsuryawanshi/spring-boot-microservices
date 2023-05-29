package com.video.rental.customer.service;

import com.video.rental.customer.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    public List<Customer> fetchAllCustomers();

    public Optional<Customer> findOneCustomer(Integer id);
}

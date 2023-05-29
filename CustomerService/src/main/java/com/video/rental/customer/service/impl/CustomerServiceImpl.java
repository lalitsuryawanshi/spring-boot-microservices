package com.video.rental.customer.service.impl;

import com.video.rental.customer.model.Customer;
import com.video.rental.customer.repository.CustomerRepository;
import com.video.rental.customer.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> fetchAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findOneCustomer(Integer id) {
        return customerRepository.findById(id);
    }
}

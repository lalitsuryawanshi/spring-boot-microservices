package com.video.rental.customer.service.impl;

import com.video.rental.customer.model.Customer;
import com.video.rental.customer.repository.CustomerRepository;
import com.video.rental.customer.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

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

    @Override
    public Customer addNewCustomer(Customer customer) {
        Customer saved = customerRepository.save(customer);
        return saved;
    }

    @Override
    public void deleteCustomer(Integer customerId) {
        customerRepository.deleteById(customerId);
    }
}

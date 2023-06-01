package com.video.calculator.service.impl;

import com.video.calculator.model.Customer;
import com.video.calculator.model.CustomerBill;
import com.video.calculator.model.Videodisk;
import com.video.calculator.proxy.CustomerServiceProxy;
import com.video.calculator.proxy.VideodiskServiceProxy;
import com.video.calculator.service.RentCalculatorService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RentCalculatorServiceImpl implements RentCalculatorService {

    private final CustomerServiceProxy customerProxy;

    private final VideodiskServiceProxy movieProxy;

    public RentCalculatorServiceImpl(CustomerServiceProxy customerProxy, VideodiskServiceProxy movieProxy) {
        this.customerProxy = customerProxy;
        this.movieProxy = movieProxy;
    }


    public Optional<CustomerBill> calculateCustomerRent(String customerId, String movieId, String numberOfDays) {

        try {
            Customer customer = customerProxy.findOneCustomer(customerId);
            Videodisk movie = movieProxy.fetchOneVideodisk(movieId);

            CustomerBill customerBill = new CustomerBill();
            customerBill.setCustomerName(customer.getUsername());
            customerBill.setMovieName(movie.getName());
            customerBill.setRentPerDay(movie.getRentPerDay());
            customerBill.setRentDays(Integer.valueOf(numberOfDays));

            double totalBill = Integer.parseInt(numberOfDays) * movie.getRentPerDay();
            customerBill.setTotalBill(totalBill);

            return Optional.of(customerBill);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return Optional.empty();
    }

}

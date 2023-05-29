package com.video.rental.customer.proxy;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="customer-service", url="localhost:8080")
public interface CustomerServiceProxy {

}

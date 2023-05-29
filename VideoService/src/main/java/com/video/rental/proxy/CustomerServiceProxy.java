package com.video.rental.proxy;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="customer-service", url="localhost:8080")
public interface CustomerServiceProxy {

}

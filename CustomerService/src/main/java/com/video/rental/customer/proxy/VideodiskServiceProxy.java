package com.video.rental.customer.proxy;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="video-disk-service", url="localhost:8081")
public interface VideodiskServiceProxy {

}

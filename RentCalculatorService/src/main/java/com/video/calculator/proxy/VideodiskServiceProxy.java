package com.video.calculator.proxy;

import com.video.calculator.model.CustomerBill;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="video-disk-service", url="localhost:8081")
public interface VideodiskServiceProxy {

    @GetMapping("/videodisks/{id}")
    public CustomerBill fetchOneVideodisk(@PathVariable String id);

}

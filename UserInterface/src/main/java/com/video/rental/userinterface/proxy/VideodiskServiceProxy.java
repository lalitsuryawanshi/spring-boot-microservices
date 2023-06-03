package com.video.rental.userinterface.proxy;


import com.video.rental.userinterface.model.Videodisk;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@FeignClient(name="video-disk-service", url="localhost:8081")
public interface VideodiskServiceProxy {

    @GetMapping("/videodisks")
    public List<Videodisk> fetchAllVideodisks();

}

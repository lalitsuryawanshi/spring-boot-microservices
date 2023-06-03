package com.video.rental.userinterface.controller;

import com.video.rental.userinterface.proxy.CustomerServiceProxy;
import com.video.rental.userinterface.proxy.VideodiskServiceProxy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class HomeController {

    private final CustomerServiceProxy customerServiceProxy;
    private final VideodiskServiceProxy videodiskServiceProxy;

    public HomeController(CustomerServiceProxy customerServiceProxy, VideodiskServiceProxy videodiskServiceProxy) {
        this.customerServiceProxy = customerServiceProxy;
        this.videodiskServiceProxy = videodiskServiceProxy;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model) {
        log.debug("Getting Index Page");
        model.addAttribute("customers", customerServiceProxy.fetchAllCustomers());
        model.addAttribute("videos", videodiskServiceProxy.fetchAllVideodisks());
        return "index";
    }
}
